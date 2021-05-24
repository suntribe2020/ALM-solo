package com.example.springdocker.service;

import com.example.springdocker.model.Car;
import com.example.springdocker.repository.CarRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by Katri Vidén
 * Date: 2021-05-24
 * Time: 16:59
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@ExtendWith(MockitoExtension.class)
class CarServiceTest {

    @Mock
    CarRepository carRepositoryMock;

    CarService carService;

    @BeforeEach
    void init() {
        carService = new CarService(carRepositoryMock);
    }

    @Test
    void getCars() {
        Car volvo = new Car(1L,"Volvo",false);
        Car kia = new Car(2L,"Kia",true);

        when(carRepositoryMock.findAll()).thenReturn(Arrays.asList(volvo, kia));
        List<Car> actual = carService.getCars();

        assertEquals(2, actual.size());
    }

    @Test
    void saveNewCar() {
        Car toyota = new Car(1L,"Toyota",true);

        when(carRepositoryMock.save(toyota)).thenReturn(toyota);
        Car actualCar = carService.saveNewCar(toyota);

        assertEquals(toyota.getName(), actualCar.getName());
    }
}
