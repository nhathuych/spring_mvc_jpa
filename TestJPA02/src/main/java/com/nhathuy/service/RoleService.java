package com.nhathuy.service;

import java.util.List;

import com.nhathuy.entity.Role;

public interface RoleService {
	List<Role> findAll();
	Role findById(long id);
}
