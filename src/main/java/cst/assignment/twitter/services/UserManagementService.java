package cst.assignment.twitter.services;


import org.springframework.stereotype.Service;


public interface UserManagementService {
	

	public String generateToken(String userName);

	public boolean authorizeRequest(String providedToken);

	public boolean authenticateUserCredentials(String userName, String password);
	

}
