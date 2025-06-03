package com.example.demo.Service;


import com.example.demo.DAO.reviewRepository;
import com.example.demo.Entities.review;
import com.example.demo.Entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    reviewRepository rr;

    @Autowired

    public ReviewService(reviewRepository rr) {
        this.rr = rr;
    }

    public void addreview(review r) {
        rr.save(r);

    }

    public List<review> findAll() {
        return rr.findAll();
    }
}
