package com.example.demo.Controller;


import com.example.demo.Entities.review;

import com.example.demo.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

    ReviewService reviewService;

    @Autowired

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping("/user/review")
    public String registerUser(@RequestParam String email,
                               @RequestParam String name,
                               @RequestParam String ureview,
                               Model model) {

        review r = new review();
        r.setEmail(email);
        r.setName(name);
        r.setUreview(ureview);
        reviewService.addreview(r);
        return "redirect:/user_dashboard.html";
    }
}
