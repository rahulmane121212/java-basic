package com.capg.abms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.abms.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	public Users findByEmail(String email);
}
