package com.example.demo.DAO;

import com.example.demo.Entities.order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface orderRepository extends JpaRepository<order,Long> {

}
