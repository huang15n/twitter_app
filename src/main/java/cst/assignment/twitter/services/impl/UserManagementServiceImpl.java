package cst.assignment.twitter.services.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import cst.assignment.twitter.services.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserManagementServiceImpl {

	private Map<String, Integer> tokenMap = new HashMap<>(); // Simulated token storage

	@Autowired
	UserService userService;

	public String authenticateUser(Integer userId, String password) {
		boolean storedUserId = getUserIdByUsernameAndPassword(userId, password);

		if (storedUserId) {
			String token = UUID.randomUUID().toString();
			tokenMap.put(token, userId);
			return token;
		}

		return null;
	}

	public int getUserIdFromToken(String token) {
		return tokenMap.getOrDefault(token, -1);
	}

	private boolean getUserIdByUsernameAndPassword(Integer userId, String password) {

		String storedPassword = userService.getPasswordByUserId(userId);
		return storedPassword != null && storedPassword.equals(password);
	}

}
