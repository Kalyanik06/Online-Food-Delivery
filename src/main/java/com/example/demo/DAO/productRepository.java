package com.example.demo.DAO;

import com.example.demo.Entities.products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productRepository extends JpaRepository<products,Integer> {


}
