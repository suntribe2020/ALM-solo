package com.example.springdocker.controller;

import com.example.springdocker.model.Car;
import com.example.springdocker.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Katri Vidén
 * Date: 2021-05-11
 * Time: 14:20
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@RequiredArgsConstructor
@RestController
public class CarController {

    private final CarService carService;

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @PostMapping("/cars")
    public void saveNewFood(@RequestBody Car car) {
        carService.saveNewCar(car);
    }

    @GetMapping("/cars/drivable")
    public List<String> getDrivableCars() {
        return carService.getDrivableCars();
    }
}
