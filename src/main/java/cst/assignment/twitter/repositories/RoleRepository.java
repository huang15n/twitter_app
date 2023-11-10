package cst.assignment.twitter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import cst.assignment.twitter.models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
