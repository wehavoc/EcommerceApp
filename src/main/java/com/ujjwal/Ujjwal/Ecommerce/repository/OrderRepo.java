package com.ujjwal.Ujjwal.Ecommerce.repository;

import com.ujjwal.Ujjwal.Ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
