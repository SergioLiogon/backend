package com.curso.demo.service;

import java.util.ArrayList;

import com.curso.demo.model.User;


public interface UserService {

	/**
	 * Ingresa o modifica un usuario
	 * @param user
	 * @return el usuario guardado
	 */
	User save(User user);

	
	/**
	 * Recupera la lista de usuario
	 * @param user
	 * @return lista de usuario
	 */
	ArrayList findAll();
	
	
}
