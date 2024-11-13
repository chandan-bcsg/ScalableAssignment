package com.bits.assignment.orderservice.service;

import com.bits.assignment.orderservice.model.Order;
import com.bits.assignment.orderservice.repository.OrderRepository;
import com.bits.assignment.orderservice.exception.OrderNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Retrieves all orders.
     */
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    /**
     * Retrieves an order by ID.
     */
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
            .orElseThrow(() -> new OrderNotFoundException("Order with ID " + id + " not found"));
    }

    /**
     * Creates a new order.
     */
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    /**
     * Updates an existing order.
     */
    @Transactional
    public Order updateOrder(Long id, Order updatedOrder) {
        return orderRepository.findById(id)
            .map(order -> {
                order.setProductName(updatedOrder.getProductName());
                order.setQuantity(updatedOrder.getQuantity());
                order.setPrice(updatedOrder.getPrice());
                return orderRepository.save(order);
            }).orElseThrow(() -> new OrderNotFoundException("Order with ID " + id + " not found"));
    }

    /**
     * Deletes an order by ID.
     */
    public void deleteOrder(Long id) {
        if (!orderRepository.existsById(id)) {
            throw new OrderNotFoundException("Order with ID " + id + " not found");
        }
        orderRepository.deleteById(id);
    }
}
