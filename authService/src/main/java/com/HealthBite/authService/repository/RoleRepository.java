package com.HealthBite.authService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.HealthBite.authService.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{
	Optional<Role> findByRoleName(String roleName);
	Boolean existsByRoleName(String roleName);

}
