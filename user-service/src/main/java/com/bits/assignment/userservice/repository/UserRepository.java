package com.bits.assignment.userservice.repository;

import com.bits.assignment.userservice.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository interface for MongoDB operations.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
