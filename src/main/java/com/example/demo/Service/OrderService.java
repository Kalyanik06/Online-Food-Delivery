package com.example.demo.Service;


import com.example.demo.DAO.orderRepository;
import com.example.demo.Entities.order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    orderRepository orr;

    @Autowired

    public OrderService(orderRepository orr) {
        this.orr = orr;
    }

    public order save(order orders) {
        return orr.save(orders);

    }

    public List<order> findAll() {
        return orr.findAll();
    }

    public order findById(Long id) {
        Optional<order> optionalOrder = orr.findById(id);
        return optionalOrder.orElse(null);
    }
}
