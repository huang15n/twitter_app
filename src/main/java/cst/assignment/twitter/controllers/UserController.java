package cst.assignment.twitter.controllers;

import java.util.List;

import cst.assignment.twitter.services.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cst.assignment.twitter.models.User;
import cst.assignment.twitter.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

//    @Autowired
//    private UserManagementService userManagementService;
    @Autowired
    private UserService userService;





//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody User user) {
//        // You should validate the username and password against your UserManagementService
//        // If valid, generate a token (for simplicity, we use a UUID here)
//        String token = "";
//        if(userManagementService.authenticateUserCredentials(user.getUsername(), user.getPassword())){
//            token = userManagementService.generateToken(user.getUsername());
//        }
//
//
//        // Return the token
//        return ResponseEntity.ok(token);
//    }


    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}

