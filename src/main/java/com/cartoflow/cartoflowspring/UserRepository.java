package com.cartoflow.cartoflowspring;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends MongoRepository<User,String> {
    public User findUserByFirstName(String firstNameUser);
    public List<User> findUserByLastName(String lastNameUser);
}