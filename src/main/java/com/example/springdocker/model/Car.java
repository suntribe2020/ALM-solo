package com.example.springdocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Katri Vidén
 * Date: 2021-05-11
 * Time: 14:17
 * Project: spring-docker-demo
 * Copyright: MIT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    String id;
    String name;
    boolean canIDriveIt;
}
