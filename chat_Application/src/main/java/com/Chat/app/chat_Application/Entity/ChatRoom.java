package com.Chat.app.chat_Application.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "chat_room", uniqueConstraints = @UniqueConstraint(columnNames = "chatId"))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ChatRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, unique = true)
	private String chatId; // user1_user2 (sorted)

	@Column(nullable = false)
	private String userA;

	@Column(nullable = false)
	private String userB;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChatId() {
		return chatId;
	}

	public void setChatId(String chatId) {
		this.chatId = chatId;
	}

	public String getUserA() {
		return userA;
	}

	public void setUserA(String userA) {
		this.userA = userA;
	}

	public String getUserB() {
		return userB;
	}

	public void setUserB(String userB) {
		this.userB = userB;
	}

}