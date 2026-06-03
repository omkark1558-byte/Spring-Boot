package com.Chat.app.chat_Application.Repository;

import com.Chat.app.chat_Application.Entity.Message;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

	@Query("""
			 SELECT m
			 FROM Message m
			 WHERE m.chatId = :chatId
			 ORDER BY m.timestamp ASC
			""")
	List<Message> getChatMessages(@Param("chatId") String chatId);

	Message findTopByChatIdOrderByTimestampDesc(String chatId);

	@Query("""
			 SELECT COUNT(m)
			 FROM Message m
			 WHERE m.chatId = :chatId
			 AND m.receiverId = :userId
			 AND m.status <> 'SEEN'
			""")
	Long countUnread(@Param("chatId") String chatId, @Param("userId") String userId);

	@Modifying
	@Query("""
			 UPDATE Message m
			 SET m.status = 'SEEN'
			 WHERE m.chatId = :chatId
			 AND m.receiverId = :userId
			""")
	void markAsSeen(@Param("chatId") String chatId, @Param("userId") String userId);

	@Modifying
	@Query("""
			 DELETE FROM Message m
			 WHERE m.chatId = :chatId
			""")
	void deleteChat(@Param("chatId") String chatId);

	@Query("""
			 SELECT COUNT(m)
			 FROM Message m
			""")
	Long totalMessages();

	@Query("""
			 SELECT m
			 FROM Message m
			 WHERE m.senderId = :senderId
			 ORDER BY m.timestamp DESC
			""")
	List<Message> getSentMessages(@Param("senderId") String senderId);

	@Query("""
			 SELECT m
			 FROM Message m
			 WHERE m.receiverId = :receiverId
			 ORDER BY m.timestamp DESC
			""")
	List<Message> getReceivedMessages(@Param("receiverId") String receiverId);
}