package com.rll.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rll.elearning.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

	User findByUserId(String userId);

}