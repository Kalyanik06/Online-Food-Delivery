package com.example.demo.Service;

import com.example.demo.DAO.productRepository;
import com.example.demo.Entities.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {


    productRepository pr;

    @Autowired
    public ProductService(productRepository pr) {
        this.pr = pr;
    }



    public List<products> findAll() {
        return pr.findAll();
    }

    public products save(products product) {
        return pr.save(product);
    }

    public void deleteById(Integer id) {
        pr.deleteById(id);
    }
}
