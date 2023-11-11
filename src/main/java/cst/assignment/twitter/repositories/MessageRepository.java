package cst.assignment.twitter.repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import cst.assignment.twitter.models.Message;
import org.springframework.data.repository.query.Param;

public interface MessageRepository extends JpaRepository<Message, Integer>{



	@Query("SELECT m FROM Message m JOIN m.user u WHERE u.userId = :userId AND u.role.roleId = :roleId")
	List<Message> findByUserUserIdAndUserRoleRoleId(@Param("userId") Integer userId, @Param("roleId") Integer roleId);



}
