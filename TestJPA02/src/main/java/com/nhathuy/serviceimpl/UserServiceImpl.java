package com.nhathuy.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nhathuy.entity.User;
import com.nhathuy.repository.UserRepository;
import com.nhathuy.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
}
