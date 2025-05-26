package com.HealthBite.authService.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthBite.authService.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String userName);
	Optional<User> findByEmail(String email);
	Boolean existsByUserName(String userName);
	Boolean existsByEmail(String email);
	List<User> findByIsActiveTrue();

}
