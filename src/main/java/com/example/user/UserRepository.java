package com.example.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, String> {
   
	  public User findByEmail(String email);
}
