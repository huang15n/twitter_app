package cst.assignment.twitter.services;

public interface UserManagementService {
	
	public String authenticateUser(String username, String password);
	public int getUserIdFromToken(String token) ;
	

}
