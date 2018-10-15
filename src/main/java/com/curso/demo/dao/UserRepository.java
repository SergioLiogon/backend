package com.curso.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	@SuppressWarnings("unchecked")
	User save(User user);
}
