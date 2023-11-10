package cst.assignment.twitter.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst.assignment.twitter.models.Subscription;
import cst.assignment.twitter.repositories.SubscriptionRepository;
import cst.assignment.twitter.services.SubscriptionService;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
	@Autowired
	private SubscriptionRepository subscriptionRepository;

 
	@Override
	public List<Subscription> getSubscriptionsForSubscriber(int subscriberId) {
		return subscriptionRepository.findBySubscriberUserId(subscriberId);
	}

}
