package cst.assignment.twitter.services;

import java.util.List;

import cst.assignment.twitter.models.Message;

public interface MessageService {

	List<Message> getAllMessages();

	List<Message> getMessagesByProducer(int producerId);

	List<Message> getMessagesBySubscriber(int subscriberId);

}
