package cst.assignment.twitter.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cst.assignment.twitter.models.Subscription;
import cst.assignment.twitter.services.SubscriptionService;

@RestController
@RequestMapping("/subscriptions")
public class SubscriptionController {

    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping("/subscriber/{subscriberId}")
    public Subscription getSubscriptionsForSubscriber(@PathVariable int subscriberId) {
        return subscriptionService.getSubscriptionsForSubscriber(subscriberId).orElse(null);
    }
}
