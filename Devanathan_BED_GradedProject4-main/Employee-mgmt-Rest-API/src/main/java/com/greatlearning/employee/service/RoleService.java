package com.greatlearning.employee.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.greatlearning.employee.entity.Role;
import com.greatlearning.employee.repository.RoleRepository;

@Service
public class RoleService {

	private final RoleRepository roleRepository;

	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public Role AddRole(Role role) {
		Role savedrole = this.roleRepository.save(role);
		return savedrole;
	}

	public Set<Role> fetchAllRoles() {
		return new HashSet<>(this.roleRepository.findAll());
	}

	public Role fetchById(long roleId) {
		return this.roleRepository.findById(roleId).orElseThrow(() -> new IllegalArgumentException("Invalid role id"));
	}

	public void deleteById(long roleId) {
		this.roleRepository.deleteById(roleId);
	}

}
