package cst.assignment.twitter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cst.assignment.twitter.models.Message;
import cst.assignment.twitter.services.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/")
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @GetMapping("/producer/{producerId}")
    public List<Message> getMessagesByProducer(@PathVariable int producerId) {
        return messageService.getMessagesByProducer(producerId);
    }
}
