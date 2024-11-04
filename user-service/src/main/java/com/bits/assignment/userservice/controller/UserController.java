// user-service/src/main/java/com/bits/assignment/userservice/controller/UserController.java
package com.bits.assignment.userservice.controller;

import com.bits.assignment.userservice.model.User;
import com.bits.assignment.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing user-related requests.
 */
@RestController
@RequestMapping("/api/users") // API prefix added for better organization
public class UserController {
    
    @Autowired
    private UserService userService;

    /**
     * Retrieves all users.
     * 
     * @return a list of users
     */
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    /**
     * Creates a new user.
     * 
     * @param user the user to create
     * @return the created user
     */
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    /**
     * Retrieves a user by ID.
     * 
     * @param id the ID of the user to retrieve
     * @return the user with the specified ID
     */
    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    /**
     * Updates an existing user.
     * 
     * @param id the ID of the user to update
     * @param user the updated user information
     * @return the updated user
     */
    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    /**
     * Deletes a user by ID.
     * 
     * @param id the ID of the user to delete
     */
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.deleteUser(id);
    }
}
