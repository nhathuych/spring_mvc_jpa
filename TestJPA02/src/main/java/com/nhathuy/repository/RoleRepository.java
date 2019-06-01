package com.nhathuy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhathuy.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
