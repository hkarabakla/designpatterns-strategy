package com.hk.strategy.impl;


import com.hk.model.Car;
import com.hk.strategy.IStrategy;
import org.springframework.stereotype.Component;

@Component
public class CarBuilderStrategy implements IStrategy<Car> {

    @Override
    public void build(Car car) {
        System.out.println("Car is building");
    }
}
