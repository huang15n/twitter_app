package cst.assignment.twitter.services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst.assignment.twitter.models.User;
import cst.assignment.twitter.repositories.UserRepository;
import cst.assignment.twitter.services.UserService;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	 @Override
	    public List<User> getAllUsers() {
	        return userRepository.findAll();
	    }

	    @Override
	    public User createUser(User user) {
	        return userRepository.save(user);
	    }
	    


}
