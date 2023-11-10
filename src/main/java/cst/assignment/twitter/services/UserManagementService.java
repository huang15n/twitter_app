package cst.assignment.twitter.services;


import org.springframework.stereotype.Service;


public interface UserManagementService {
	
	public String authenticateUser(String username, String password);
	public int getUserIdFromToken(String token) ;

	public String generateToken(String userName);

	public boolean authenticateUserCredentials(String userName, String password);
	

}
