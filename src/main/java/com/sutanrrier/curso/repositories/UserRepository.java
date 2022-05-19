package com.sutanrrier.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sutanrrier.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
