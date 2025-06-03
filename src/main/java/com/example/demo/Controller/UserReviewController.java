package com.example.demo.Controller;


import com.example.demo.Entities.review;
import com.example.demo.Entities.user;
import com.example.demo.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserReviewController {

    ReviewService reviewService;

    @Autowired

    public UserReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @RequestMapping("/review")
    public String listOfStd(Model theModel){

        List<review> userList=reviewService.findAll();
        theModel.addAttribute("reviews",userList);

        return "review_list";
    }
}
