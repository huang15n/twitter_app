package cst.assignment.twitter.services.impl;

import cst.assignment.twitter.models.User;
import cst.assignment.twitter.repositories.UserRepository;
import cst.assignment.twitter.services.UserManagementService;
import cst.assignment.twitter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserManagementServiceImpl implements UserManagementService {

	private final Map<String, String> userTokenMap = new HashMap<>(); // Simulated user-to-token mapping



	@Autowired
	private UserRepository userRepository;

	public String generateToken(String userName) {
		String token = UUID.randomUUID().toString();
		userTokenMap.put(userName, token);
		return token;
	}


	public boolean authorizeRequest(String providedToken) {

       System.out.println("the current tokens on hold is : ");
		userTokenMap.forEach((key, value) -> {
			System.out.println("Key: " + key + ", Value: " + value);
		});

		System.out.println("the user map contains this token is :" + userTokenMap.containsValue(providedToken));
		// Check if the provided token matches the stored token for the user
		return userTokenMap.containsValue(providedToken);
	}

	public boolean authenticateUserCredentials(String userName, String password) {
		User user = userRepository.findPasswordByUsername(userName);

		return user.getPassword() != null && user.getPassword().equals(password);
	}
}

