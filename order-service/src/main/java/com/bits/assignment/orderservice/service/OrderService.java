package com.bits.assignment.orderservice.service;

import com.bits.assignment.orderservice.model.Order;
import com.bits.assignment.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for handling business logic related to orders.
 */
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    /**
     * Retrieves all orders.
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    /**
     * Creates a new order.
     */
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
