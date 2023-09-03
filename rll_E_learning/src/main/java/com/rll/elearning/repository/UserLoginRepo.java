package com.rll.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rll.elearning.model.UserLogin;
@Repository
public interface UserLoginRepo extends JpaRepository<UserLogin,String> {

	UserLogin findByUserId(String userId);

}
