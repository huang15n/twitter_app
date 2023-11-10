package cst.assignment.twitter.controllers;

import java.util.List;

import cst.assignment.twitter.services.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cst.assignment.twitter.models.User;
import cst.assignment.twitter.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

//    @Autowired
//    private UserManagementService userManagementService;

    private final UserService userService;
    private final UserManagementService userManagementService;

    @Autowired
    public UserController(UserService userService, UserManagementService userManagementService) {
        this.userService = userService;
        this.userManagementService = userManagementService;
    }





    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        // You should validate the username and password against your UserManagementService
        // If valid, generate a token (for simplicity, we use a UUID here)
        String token = "";
        if(userManagementService.authenticateUserCredentials(user.getUsername(), user.getPassword())){
            token = userManagementService.generateToken(user.getUsername());
        }else {
            // Return an unauthorized response if credentials are invalid
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }


        // Return the token
        return ResponseEntity.ok(token);
    }


    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers(@RequestHeader("Authorization") String authorizationHeader) {
        // Check if the request is authorized



        if (authorizationHeader != null) {
            String token = authorizationHeader; // Extracting the token part after "Bearer "
            System.out.println("the token is " + token);


            if (userManagementService.authorizeRequest(token)) {
                // Perform the action (e.g., fetch all users)
                List<User> users = userService.getAllUsers();
                return ResponseEntity.ok(users);
            }
        }

        // Return an unauthorized response if the token is missing or the request is not authorized
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }




    @PostMapping("/addUser")
    public ResponseEntity<User> createUser(@RequestBody User user, @RequestHeader("Authorization") String authorizationHeader) {


        if (authorizationHeader != null) {
            String token = authorizationHeader; // Extracting the token part after "Bearer "
            System.out.println("the token is " + token);


            if (userManagementService.authorizeRequest(token)) {
                // Perform the action (e.g., fetch all users)
                List<User> users = userService.getAllUsers();
                return ResponseEntity.ok(userService.createUser(user));
            }
        }

        // Return an unauthorized response if the token is missing or the request is not authorized
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}

