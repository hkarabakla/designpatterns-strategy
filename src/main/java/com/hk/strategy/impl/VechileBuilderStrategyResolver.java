package com.hk.strategy.impl;

import com.hk.model.Car;
import com.hk.model.MotorBike;
import com.hk.model.Truck;
import com.hk.strategy.IStrategy;
import com.hk.strategy.IStrategyResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VechileBuilderStrategyResolver implements IStrategyResolver {

    @Autowired
    private CarBuilderStrategy carBuilderStrategy;

    @Autowired
    private MotorBikeBuilderStrategy motorBikeBuilderStrategy;

    @Autowired
    private TruckBuilderStrategy truckBuilderStrategy;

    @Override
    public IStrategy visit(Car car) {
        return carBuilderStrategy;
    }

    @Override
    public IStrategy visit(MotorBike motorBike) {
        return motorBikeBuilderStrategy;
    }

    @Override
    public IStrategy visit(Truck truck) {
        return truckBuilderStrategy;
    }
}
