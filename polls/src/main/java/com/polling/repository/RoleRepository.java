package com.polling.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.polling.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(String name);
}
