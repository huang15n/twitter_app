package cst.assignment.twitter.services.impl;

import cst.assignment.twitter.repositories.UserRepository;
import cst.assignment.twitter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserManagementServiceImpl {

	private final Map<String, String> userTokenMap = new HashMap<>(); // Simulated user-to-token mapping



	@Autowired
	private UserRepository userRepository;

	public String generateToken(String userName) {
		String token = UUID.randomUUID().toString();
		userTokenMap.put(userName, token);
		return token;
	}


	public boolean authorizeRequest(String userName, String providedToken) {
		String storedToken = userTokenMap.get(userName);

		// Check if the provided token matches the stored token for the user
		return storedToken != null && storedToken.equals(providedToken);
	}

	private boolean authenticateUserCredentials(String userName, String password) {
		String storedPassword = userRepository.findPasswordByUsername(userName);

		return storedPassword != null && storedPassword.equals(password);
	}
}

