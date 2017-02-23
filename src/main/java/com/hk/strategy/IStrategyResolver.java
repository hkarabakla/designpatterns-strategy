package com.hk.strategy;

import com.hk.model.Car;
import com.hk.model.MotorBike;
import com.hk.model.Truck;

public interface IStrategyResolver {

    IStrategy visit(Car car);
    IStrategy visit(MotorBike motorBike);
    IStrategy visit(Truck truck);
}
