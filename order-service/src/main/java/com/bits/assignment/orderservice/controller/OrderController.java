package com.bits.assignment.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bits.assignment.orderservice.exception.OrderNotFoundException;
import com.bits.assignment.orderservice.model.Order;
import com.bits.assignment.orderservice.service.OrderService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * Retrieves all orders.
     */
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    /**
     * Retrieves an order by ID.
     */
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        try {
            return orderService.getOrderById(id);
        } catch (OrderNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    /**
     * Creates a new order.
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder(@Valid @RequestBody Order order) {
        return orderService.createOrder(order);
    }

    /**
     * Updates an existing order.
     */
    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable Long id, @Valid @RequestBody Order order) {
        try {
            return orderService.updateOrder(id, order);
        } catch (OrderNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    /**
     * Deletes an order by ID.
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder(@PathVariable Long id) {
        try {
            orderService.deleteOrder(id);
        } catch (OrderNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
