package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.Login;
import com.example.demo.Repositiry.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository repo;

	public Login login(String username, String password) {
		Login user = repo.findByUsernameAndPassword(username, password);
		return user;
	}

}
