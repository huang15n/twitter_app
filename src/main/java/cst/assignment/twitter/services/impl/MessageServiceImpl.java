package cst.assignment.twitter.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst.assignment.twitter.models.Message;
import cst.assignment.twitter.repositories.MessageRepository;
import cst.assignment.twitter.services.MessageService;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
    private MessageRepository messageRepository;
	
	 @Override
	    public List<Message> getAllMessages() {
	        return messageRepository.findAll();
	    }

	    @Override
	    public List<Message> getMessagesByProducer(int producerId) {
	        return messageRepository.findByUserUserIdAndUserRoleRoleId(producerId, 1);
	    }

	@Override
	public List<Message> getMessagesBySubscriber(int subscriberId) {
		return messageRepository.findByUserUserIdAndUserRoleRoleId(subscriberId, 2);
	}

}
