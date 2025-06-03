package com.example.demo.Controller;


import com.example.demo.Entities.admin;
import com.example.demo.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    AdminService adminService;

    @Autowired
    public LoginController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/admin/login")
    public String showAdminLoginForm() {
        return "redirect:/admin_login.html";
    }

    @PostMapping("/admin/login")
    public String processAdminLogin(@RequestParam String email,
                                    @RequestParam String password,
                                    Model model) {
        admin ad = adminService.validateAdmin(email, password);
        if (ad != null ) {
            return "redirect:/admin_dashboard.html";
        }

        return "redirect:/admin_login.html";
    }

    @PostMapping("/admin/signup")
    public String registerAdmin(@RequestParam String firstname,
                                @RequestParam String lastname,
                                @RequestParam String contactno,
                                @RequestParam String email,
                                @RequestParam String password,
                                Model model) {

        admin ad = new admin();
        ad.setFirstname(firstname);
        ad.setLastname(lastname);
        ad.setContactno(contactno);
        ad.setEmail(email);
        ad.setPassword(password);
        adminService.registerAdmin(ad);
        return "redirect:/admin_login.html";
    }


}
