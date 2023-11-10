package cst.assignment.twitter.services;

import java.util.List;

import cst.assignment.twitter.models.Role;

public interface RoleService {
	
	List<Role> getAllRoles();
    Role getRoleById(int roleId);
    Role createRole(Role role);
    void deleteRole(int roleId);

}
