package cst.assignment.twitter.services;


import org.springframework.stereotype.Service;

@Service
public interface UserManagementService {
	
	public String authenticateUser(String username, String password);
	public int getUserIdFromToken(String token) ;
	

}
