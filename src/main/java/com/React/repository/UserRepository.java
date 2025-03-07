package com.React.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.React.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> 
{
	 boolean existsByEmail(String email);
}
