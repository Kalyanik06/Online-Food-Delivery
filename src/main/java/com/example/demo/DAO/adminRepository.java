package com.example.demo.DAO;

import com.example.demo.Entities.admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface adminRepository extends JpaRepository<admin, String> {

    admin findByEmailAndPassword(String email, String password);

}
