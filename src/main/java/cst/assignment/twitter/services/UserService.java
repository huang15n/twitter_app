package cst.assignment.twitter.services;

import java.util.List;


import cst.assignment.twitter.models.User;

public interface UserService {
	
	List<User> getAllUsers();
    User createUser(User user);



}
