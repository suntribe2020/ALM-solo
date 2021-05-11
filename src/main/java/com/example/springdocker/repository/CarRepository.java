package com.example.springdocker.repository;

import com.example.springdocker.model.Car;
import com.example.springdocker.model.Food;
import org.springframework.data.mongodb.core.MongoAdminOperations;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by Katri Vidén
 * Date: 2021-05-11
 * Time: 14:21
 * Project: spring-docker-demo
 * Copyright: MIT
 */
public interface CarRepository extends MongoRepository<Car, String> {
    List<Car> findCarByCanIDriveIt(boolean canDrive);
}
