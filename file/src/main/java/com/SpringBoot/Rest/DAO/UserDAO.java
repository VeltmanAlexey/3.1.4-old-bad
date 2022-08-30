package com.SpringBoot.Rest.DAO;

import com.SpringBoot.Rest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User,Long> {
    User findByUsername(String username);
}