package com.example.demo.Controller;


import com.example.demo.Entities.user;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class UserController {

    UserService userService;

    @Autowired
    public UserController( UserService  userService) {
        this.userService = userService;
    }


    @GetMapping("/user/login")
    public String showAdminLoginForm() {
        return "redirect:/user_login.html";
    }

    @PostMapping("/user/login")
    public String processUserLogin(@RequestParam String email,
                                    @RequestParam String password,
                                    Model model) {
        user ad = userService.validateUser(email, password);
        if (ad != null ) {
            return "redirect:/user_dashboard.html";
        }

        return "redirect:/user_login.html";
    }

    @PostMapping("/user/signup")
    public String registerUser(@RequestParam String firstname,
                                @RequestParam String lastname,
                                @RequestParam String contactno,
                                @RequestParam String address,
                                @RequestParam String email,
                                @RequestParam String password,
                                Model model) {

        user ad = new user();
        ad.setFirstname(firstname);
        ad.setLastname(lastname);
        ad.setContactno(contactno);
        ad.setAddress(address);
        ad.setEmail(email);
        ad.setPassword(password);
        userService.registeruser(ad);
        return "redirect:/user_login.html";
    }


}
