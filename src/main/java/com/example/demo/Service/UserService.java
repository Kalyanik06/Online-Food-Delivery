package com.example.demo.Service;

import com.example.demo.DAO.adminRepository;
import com.example.demo.DAO.userRepository;
import com.example.demo.Entities.admin;
import com.example.demo.Entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    userRepository ar;

    @Autowired
    public UserService(userRepository ar) {
        this.ar = ar;
    }


    public user validateUser(String email, String password) {
        return ar.findByEmailAndPassword(email, password);
    }

    public void registeruser(user ad) {
        ar.save(ad);

    }


    public List<user> findAll() {
        return ar.findAll();
    }
}
