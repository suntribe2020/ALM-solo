package com.example.springdocker.service;

import com.example.springdocker.model.Food;
import com.example.springdocker.repository.FoodRepository;
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
 * Time: 10:58
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@ExtendWith(MockitoExtension.class)
class FoodServiceTest {
    @Mock
    FoodRepository foodRepositoryMock;

    FoodService foodService;

    @BeforeEach
    void init() {
        foodService = new FoodService(foodRepositoryMock);
    }

    @Test
    void getFoods() {
        Food pizza = new Food("1","Pizza",true,true);
        Food sushi = new Food("2","Sushi",true,false);
        Food tacos = new Food("3","Tacos",true,true);

        when(foodRepositoryMock.findAll()).thenReturn(Arrays.asList(pizza,sushi, tacos));
        List<Food> actual = foodService.getFoods();

        assertEquals(3, actual.size());
    }
}
