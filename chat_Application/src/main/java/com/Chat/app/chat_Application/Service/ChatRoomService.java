package com.Chat.app.chat_Application.Service;

import com.Chat.app.chat_Application.Entity.ChatRoom;
import com.Chat.app.chat_Application.Repository.ChatRoomRepository;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
@Transactional
public class ChatRoomService {

	private final ChatRoomRepository repo;

	public ChatRoomService(ChatRoomRepository repo) {
		this.repo = repo;
	}

	public String getOrCreateChatId(String user1, String user2) {

		String[] users = sortUsers(user1, user2);

		String chatId = users[0] + "_" + users[1];

		return repo.findByChatId(chatId).map(ChatRoom::getChatId).orElseGet(() -> {

			ChatRoom room = new ChatRoom();

			room.setChatId(chatId);
			room.setUserA(users[0]);
			room.setUserB(users[1]);
			repo.save(room);

			return chatId;
		});
	}

	private String[] sortUsers(String u1, String u2) {

		if (u1.compareTo(u2) < 0) {
			return new String[] { u1, u2 };
		}

		return new String[] { u2, u1 };
	}
}