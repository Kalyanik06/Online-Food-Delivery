package com.example.demo.DAO;

import com.example.demo.Entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, String> {

    user findByEmailAndPassword(String email, String password);
}
