// user-service/src/main/java/com/bits/assignment/userservice/service/UserService.java
package com.bits.assignment.userservice.service;

import com.bits.assignment.userservice.model.User;
import com.bits.assignment.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing user-related operations.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * Retrieves all users from the database.
     * 
     * @return a list of users
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Creates a new user in the database.
     * 
     * @param user the user to create
     * @return the created user
     */
    public User createUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Retrieves a user by ID.
     * 
     * @param id the ID of the user to retrieve
     * @return the user with the specified ID, or null if not found
     */
    public User getUserById(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null); // Return null if user is not found
    }

    /**
     * Updates an existing user in the database.
     * 
     * @param id the ID of the user to update
     * @param user the updated user information
     * @return the updated user
     */
    public User updateUser(String id, User user) {
        // Check if user exists
        if (!userRepository.existsById(id)) {
            return null; // Or throw an exception if preferred
        }
        user.setId(id); // Set the ID for the user object
        return userRepository.save(user);
    }

    /**
     * Deletes a user by ID.
     * 
     * @param id the ID of the user to delete
     */
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
