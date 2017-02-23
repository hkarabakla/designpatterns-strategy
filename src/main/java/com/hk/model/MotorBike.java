package com.hk.model;

import com.hk.strategy.IStrategy;
import com.hk.strategy.IStrategyResolver;
import lombok.Data;


@Data
public class MotorBike extends Vechile {
    @Override
    public IStrategy accept(IStrategyResolver iStrategyResolver) {
        return iStrategyResolver.visit(this);
    }
}
