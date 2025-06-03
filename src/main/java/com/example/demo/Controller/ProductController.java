package com.example.demo.Controller;
import com.example.demo.Entities.products;
import com.example.demo.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/menu")
    public String showmenu(Model theModel){

        List<products> productList=productService.findAll();
        theModel.addAttribute("product",productList);

        return "menu1";
    }

    @RequestMapping("/product")
    public String listOfStd(Model theModel){

        List<products> productList=productService.findAll();
        theModel.addAttribute("product",productList);

        return "product_list";
    }

    @PostMapping("/product/add")
    public String addProduct(@ModelAttribute products product) {
        productService.save(product);
        return "redirect:/product";
    }


    @PostMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        productService.deleteById(id);
        return "redirect:/product";
    }
}
