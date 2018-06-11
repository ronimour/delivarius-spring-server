package com.delivarius.spring.server.delivariusserver.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.delivarius.spring.server.delivariusserver.domain.Order;
import com.delivarius.spring.server.delivariusserver.domain.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	public List<Order> findByUser(User user);
	
	@Query("SELECT o FROM Order o WHERE o.user.id = :userId")
	public List<Order> findByUserId(@Param("userId") Long userId);
	
}
