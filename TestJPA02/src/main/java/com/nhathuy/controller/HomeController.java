package com.nhathuy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nhathuy.entity.Role;
import com.nhathuy.entity.User;
import com.nhathuy.service.RoleService;
import com.nhathuy.service.UserService;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	UserService userService;

	@Autowired
	RoleService roleService;

	@GetMapping
	public String home(ModelMap modelMap) {
		modelMap.addAttribute("users", userService.findAll());

		Role role = roleService.findById(3);
		for (User user : role.getUsers()) {
			System.out.println("---------- " + user.getFullname());
		}

		return "home";
	}
}
