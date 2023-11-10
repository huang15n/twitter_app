package cst.assignment.twitter.services;

import java.util.List;

import cst.assignment.twitter.models.Subscription;

public interface SubscriptionService {
	List<Subscription> getSubscriptionsForSubscriber(int subscriberId);

}
