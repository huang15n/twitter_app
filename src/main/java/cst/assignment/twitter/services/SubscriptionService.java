package cst.assignment.twitter.services;

import java.util.Optional;

import cst.assignment.twitter.models.Subscription;

public interface SubscriptionService {
	Optional<Subscription> getSubscriptionsForSubscriber(Integer subscriberId);

}
