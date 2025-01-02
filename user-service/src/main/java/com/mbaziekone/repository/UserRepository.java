package com.mbaziekone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbaziekone.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
