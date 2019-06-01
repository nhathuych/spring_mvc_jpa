package com.nhathuy.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nhathuy.entity.Customer;
import com.nhathuy.repository.CustomerRepository;
import com.nhathuy.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
