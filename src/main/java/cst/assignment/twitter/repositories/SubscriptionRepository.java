package cst.assignment.twitter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cst.assignment.twitter.models.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Integer>{


}
