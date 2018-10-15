package com.curso.demo.controllers;





import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.demo.model.User;
import com.curso.demo.service.UserService;
import com.curso.demo.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class UserController {

	@Autowired
	protected UserService userService;
	
	protected ObjectMapper mapper;
	
	
	
	
	
	
	
    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson) throws JsonParseException,
	JsonMappingException, IOException{
		
   this.mapper = new ObjectMapper();
		
		User user = this.mapper.readValue(userJson, User.class);
		
		if(!this.validate(user)){
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),
					"Tiene que llenar los campos obligatorios");
			
		}
		this.userService.save(user);
		return new RestResponse(HttpStatus.OK.value(), "Operacion Exitosa");
	}	
	
	
	private boolean validate(User user){
		
		boolean isValied = true;
		
		if(user.getFirstName() == null || user.getFirstName() ==""){
			
			isValied =false;
		}
		
		if(user.getFirstSurname() == null || user.getFirstSurname() =="" ){
			isValied = false;
			
		}
		if(user.getAdress() == null   || user.getAdress() ==""){
			isValied = false;
			
		}
		
		return isValied;
	}
}
