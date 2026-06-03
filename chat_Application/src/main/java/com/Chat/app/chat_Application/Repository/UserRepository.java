package com.Chat.app.chat_Application.Repository;

import com.Chat.app.chat_Application.Entity.User;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

	Optional<User> findByUsername(String username);

	@Query("""
			 SELECT u
			 FROM User u
			 WHERE LOWER(u.username)
			 LIKE LOWER(CONCAT('%', :keyword, '%'))
			""")
	List<User> searchUsers(@Param("keyword") String keyword);

	@Query("""
			 SELECT u
			 FROM User u
			 WHERE u.id <> :userId
			""")
	List<User> findAllExcept(@Param("userId") String userId);

	List<User> findByStatus(String status);

	boolean existsByUsername(String username);

	List<User> findByIdIn(List<String> ids);

	@Modifying
	@Query("""
			 UPDATE User u
			 SET u.status = :status
			 WHERE u.id = :userId
			""")
	void updateUserStatus(@Param("userId") String userId, @Param("status") String status);

	@Query("""
			 SELECT u
			 FROM User u
			 WHERE u.status = 'ONLINE'
			""")
	List<User> getOnlineUsers();

	@Query("""
			 SELECT COUNT(u)
			 FROM User u
			 WHERE u.status = 'ONLINE'
			""")
	Long countOnlineUsers();
}