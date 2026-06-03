package com.Chat.app.chat_Application.Repository;

import com.Chat.app.chat_Application.Entity.ChatRoom;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {

	Optional<ChatRoom> findByChatId(String chatId);

	@Query("""
			 SELECT c
			 FROM ChatRoom c
			 WHERE c.userA = :userId
			 OR c.userB = :userId
			""")
	List<ChatRoom> getUserChats(@Param("userId") String userId);

	@Query("""
			 SELECT COUNT(c)
			 FROM ChatRoom c
			""")
	Long totalChats();

	boolean existsByChatId(String chatId);
}