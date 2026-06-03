package com.Chat.app.chat_Application.Service;

import com.Chat.app.chat_Application.Entity.Message;
import com.Chat.app.chat_Application.Repository.MessageRepository;

import jakarta.transaction.Transactional;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class ChatService {

    private final MessageRepository repo;

    public ChatService(MessageRepository repo) {
        this.repo = repo;
    }

    // Save message
    public Message saveMessage(Message msg) {

        if (msg.getContent() == null || msg.getContent().isBlank()) {
            throw new RuntimeException("Message cannot be empty");
        }

        msg.setTimestamp(LocalDateTime.now());
        msg.setStatus("SENT");

        return repo.save(msg);
    }

    // Get chat history
    public List<Message> getMessages(String chatId) {
        return repo.getChatMessages(chatId);
    }

    // Last message
    public Message getLastMessage(String chatId) {
        return repo.findTopByChatIdOrderByTimestampDesc(chatId);
    }

    // Unread count
    public Long unreadCount(String chatId, String userId) {
        return repo.countUnread(chatId, userId);
    }

    // Seen update
    public void markSeen(String chatId, String userId) {
        repo.markAsSeen(chatId, userId);
    }
}