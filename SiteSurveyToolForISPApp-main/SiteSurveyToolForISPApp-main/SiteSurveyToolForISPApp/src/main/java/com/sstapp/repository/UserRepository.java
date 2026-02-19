package com.sstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sstapp.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	 User findByUserEmail(String userEmail); 
}
