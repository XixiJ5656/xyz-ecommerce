package com.ecommerce.backend.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.backend.model.Order;




@Repository
public interface OrderRepository extends JpaRepository <Order,UUID>{

}
