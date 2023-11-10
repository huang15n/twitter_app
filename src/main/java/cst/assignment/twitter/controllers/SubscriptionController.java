package cst.assignment.twitter.controllers;

import java.util.List;

import cst.assignment.twitter.models.User;
import cst.assignment.twitter.services.UserManagementService;
import cst.assignment.twitter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cst.assignment.twitter.models.Subscription;
import cst.assignment.twitter.services.SubscriptionService;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    private final UserManagementService userManagementService;


    @Autowired
    public SubscriptionController (UserManagementService userManagementService) {
        this.userManagementService = userManagementService;
    }


    @GetMapping("/subscriber/{subscriberId}")
    public ResponseEntity<Subscription> getSubscriptionsForSubscriber(@PathVariable int subscriberId, @RequestHeader("Authorization") String authorizationHeader) {


        if (authorizationHeader != null) {
            String token = authorizationHeader;
            System.out.println("the token is " + token);


            if (userManagementService.authorizeRequest(token)) {

                return ResponseEntity.ok(subscriptionService.getSubscriptionsForSubscriber(subscriberId).orElse(null));
            }
        }

         return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
