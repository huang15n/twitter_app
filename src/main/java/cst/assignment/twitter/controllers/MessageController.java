package cst.assignment.twitter.controllers;

import java.util.List;

import cst.assignment.twitter.services.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import cst.assignment.twitter.models.Message;
import cst.assignment.twitter.services.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    private final UserManagementService userManagementService;


    @Autowired
    public MessageController (UserManagementService userManagementService) {
        this.userManagementService = userManagementService;
    }

    @GetMapping("/allMessages")
    public ResponseEntity<List<Message>> getAllMessages(@RequestHeader("Authorization") String authorizationHeader) {

        if (authorizationHeader != null) {
            String token = authorizationHeader;
            System.out.println("the token is " + token);


            if (userManagementService.authorizeRequest(token)) {

                return ResponseEntity.ok(messageService.getAllMessages());
            }
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @GetMapping("/producer/{producerId}")
    public ResponseEntity<List<Message>> getMessagesByProducer(@PathVariable int producerId, @RequestHeader("Authorization") String authorizationHeader) {


        if (authorizationHeader != null) {
            String token = authorizationHeader;
            System.out.println("the token is " + token);


            if (userManagementService.authorizeRequest(token)) {

                return ResponseEntity.ok(messageService.getMessagesByProducer(producerId));
            }
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }


    @GetMapping("/subscriber/{subscriberId}")
    public ResponseEntity<List<Message>> getMessagesBySubscriber(@PathVariable int subscriberId, @RequestHeader("Authorization") String authorizationHeader) {


        if (authorizationHeader != null) {
            String token = authorizationHeader;
            System.out.println("the token is " + token);


            if (userManagementService.authorizeRequest(token)) {

                return ResponseEntity.ok(messageService.getMessagesBySubscriber(subscriberId));
            }
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }
}
