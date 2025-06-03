package com.example.demo.Controller;


import com.example.demo.Entities.order;
import com.example.demo.Entities.products;
import com.example.demo.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {

    OrderService orderService;

    @Autowired

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/order/add")
    public String addProduct(@ModelAttribute order orders) {
        orderService.save(orders);
        return "redirect:/menu?success=true";
    }

    @PostMapping("/order/update/{id}")
    public String updateOrderStatus(@PathVariable Long id, @RequestParam String status) {
        order or = orderService.findById(id);
        if (or != null) {
            or.setStatus(status);
            orderService.save(or);
        }
        return "redirect:/order";
    }

    @RequestMapping("/order")
    public String listOfStd(Model theModel){

        List<order> productList=orderService.findAll();
        theModel.addAttribute("orders",productList);

        return "order_list";
    }
}
