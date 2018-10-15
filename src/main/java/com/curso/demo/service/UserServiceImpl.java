package com.curso.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.demo.dao.UserRepository;
import com.curso.demo.model.User;

import antlr.collections.List;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	protected UserRepository userRepository;
	
	
	public User save(User user)
	{
		
		return this.userRepository.save(user);
	}


	@Override
	public ArrayList<User> findAll() {
	
		return (ArrayList<User>) this.userRepository.findAll();
	}


	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		 this.userRepository.deleteById(id);
	}
}
