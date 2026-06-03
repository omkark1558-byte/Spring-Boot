package com.Chat.app.chat_Application.Controller;

import com.Chat.app.chat_Application.Entity.Message;
import com.Chat.app.chat_Application.Service.ChatRoomService;
import com.Chat.app.chat_Application.Service.ChatService;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;
 

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

	private final ChatService chatService;
	private final ChatRoomService roomService;
	private final SimpMessagingTemplate messagingTemplate;

	public ChatController(ChatService chatService, ChatRoomService roomService,
			SimpMessagingTemplate messagingTemplate) {

		this.chatService = chatService;
		this.roomService = roomService;
		this.messagingTemplate = messagingTemplate;
	}

	@MessageMapping("/private-message")
	public void privateMessage(Message message) {

		String chatId = roomService.getOrCreateChatId(message.getSenderId(), message.getReceiverId());

		message.setChatId(chatId);

		Message saved = chatService.saveMessage(message);

		messagingTemplate.convertAndSendToUser(message.getReceiverId(), "/queue/messages", saved);

		messagingTemplate.convertAndSendToUser(message.getSenderId(), "/queue/messages", saved);
	}

	@GetMapping("/messages/{user1}/{user2}")
	public List<Message> getMessages(@PathVariable String user1, @PathVariable String user2) {

		String chatId = roomService.getOrCreateChatId(user1, user2);

		return chatService.getMessages(chatId);
	}
}