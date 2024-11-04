// order-service/src/main/java/com/bits/assignment/orderservice/controller/OrderController.java
package com.bits.assignment.orderservice.controller;

import com.bits.assignment.orderservice.model.Order;
import com.bits.assignment.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing order-related requests.
 */
@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * Retrieves all orders.
     */
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    /**
     * Creates a new order.
     */
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }
}
