package com.javaguides.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaguides.springbootbackend.model.User;

public interface UserRespository extends JpaRepository<User, Long>{

}
