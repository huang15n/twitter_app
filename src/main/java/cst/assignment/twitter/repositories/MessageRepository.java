package cst.assignment.twitter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cst.assignment.twitter.models.Message;

public interface MessageRepository extends JpaRepository<Message, Integer>{

	List<Message> findByUserUserId(int producerId);

}
