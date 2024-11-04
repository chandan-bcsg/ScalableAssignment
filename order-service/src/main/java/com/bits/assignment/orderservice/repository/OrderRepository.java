// order-service/src/main/java/com/bits/assignment/orderservice/repository/OrderRepository.java
package com.bits.assignment.orderservice.repository;

import com.bits.assignment.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * OrderRepository interface for PostgreSQL operations.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
