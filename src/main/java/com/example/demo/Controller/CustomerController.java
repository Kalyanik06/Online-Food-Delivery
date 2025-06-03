package com.example.demo.Controller;

import com.example.demo.Entities.user;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;


@Controller
public class CustomerController {

    UserService userService;

    @Autowired
     public CustomerController(UserService userService){
        this.userService=userService;
    }

    @RequestMapping("/customer")
    public String listOfStd(Model theModel){

        List<user> userList=userService.findAll();
        theModel.addAttribute("users",userList);

        return "customer_list";
    }
}

