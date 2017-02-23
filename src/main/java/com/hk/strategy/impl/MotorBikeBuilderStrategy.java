package com.hk.strategy.impl;

import com.hk.model.MotorBike;
import com.hk.strategy.IStrategy;
import org.springframework.stereotype.Component;

@Component
public class MotorBikeBuilderStrategy implements IStrategy<MotorBike> {
    @Override
    public void build(MotorBike motorBike) {
        System.out.println("MotorBike is building");
    }
}
