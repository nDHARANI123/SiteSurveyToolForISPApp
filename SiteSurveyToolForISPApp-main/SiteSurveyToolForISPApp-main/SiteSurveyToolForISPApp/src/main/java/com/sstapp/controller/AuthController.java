package com.sstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sstapp.config.JwtUtil;
import com.sstapp.entity.User;
import com.sstapp.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	private UserRepository userRepo;

	@PostMapping("/register")
	public User register(@RequestBody User u) {

		return userRepo.save(u);
	}

	@PostMapping("/login")
	public String login(@RequestBody User u, HttpSession session) {

		User dbUser = userRepo.findByUserEmail(u.getUserEmail());

		if (dbUser != null && dbUser.getUserPass().equals(u.getUserPass())) {

			String token = JwtUtil.generateToken(dbUser.getUserEmail());

			session.setAttribute("JWT", token);
			session.setAttribute("USER", dbUser.getUserFullName());

			return "\t Login Successful";
		}
		return "\t Invalid Credentials... Try Again....!!";
	}

}
