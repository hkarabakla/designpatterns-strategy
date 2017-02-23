package com.hk.strategy.impl;

import com.hk.model.Truck;
import com.hk.strategy.IStrategy;
import org.springframework.stereotype.Component;

@Component
public class TruckBuilderStrategy implements IStrategy<Truck> {
    @Override
    public void build(Truck truck) {
        System.out.println("Truck is building");
    }
}
