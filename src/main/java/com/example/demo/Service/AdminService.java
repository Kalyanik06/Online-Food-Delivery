package com.example.demo.Service;


import com.example.demo.DAO.adminRepository;
import com.example.demo.Entities.admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {


    adminRepository ar;

    @Autowired
    public AdminService(adminRepository ar) {
        this.ar = ar;
    }


    public admin validateAdmin(String email, String password) {
        return ar.findByEmailAndPassword(email, password);
    }

    public void registerAdmin(admin ad) {
             ar.save(ad);

    }
}
