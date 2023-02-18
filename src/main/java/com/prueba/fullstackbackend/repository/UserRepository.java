package com.prueba.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
