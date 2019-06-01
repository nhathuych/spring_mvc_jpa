package com.nhathuy.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nhathuy.entity.Role;
import com.nhathuy.repository.RoleRepository;
import com.nhathuy.service.RoleService;

@Service
@Transactional
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Role findById(long id) {
		return roleRepository.findById(id).get();
	}
}
