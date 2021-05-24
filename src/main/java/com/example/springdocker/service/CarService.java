package com.example.springdocker.service;

import com.example.springdocker.model.Car;
import com.example.springdocker.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Katri Vidén
 * Date: 2021-05-11
 * Time: 14:24
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@RequiredArgsConstructor
@Service
public class CarService {

    private final CarRepository carRepository;

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public Car saveNewCar(Car car) {
        return carRepository.save(car);
    }

    public List<String> getDrivableCars() {
        List<Car> drivableCars = carRepository.findCarByCanIDriveIt(true);

        // returnerar Cars namnen i en lista
        return drivableCars.stream()
                .map(Car::getName)
                .collect(Collectors.toList());
    }
}
