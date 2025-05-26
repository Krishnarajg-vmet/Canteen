package com.HealthBite.authService.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

import com.HealthBite.authService.entity.User;
import com.HealthBite.authService.entity.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer>{
	
	List<UserRole> findByUser(User user);

}
