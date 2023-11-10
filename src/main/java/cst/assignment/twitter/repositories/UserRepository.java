package cst.assignment.twitter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cst.assignment.twitter.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {


    User findPasswordByUsername(String username);

}
