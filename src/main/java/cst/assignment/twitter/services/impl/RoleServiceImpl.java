package cst.assignment.twitter.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cst.assignment.twitter.models.Role;
import cst.assignment.twitter.repositories.RoleRepository;
import cst.assignment.twitter.services.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(int roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(int roleId) {
        roleRepository.deleteById(roleId);
    }

}
