package com.hk.model;

import com.hk.strategy.IStrategy;
import com.hk.strategy.IStrategyResolver;
import lombok.Data;

@Data
public abstract class Vechile {

    private String manufacturer;
    private String engineType;
    private String enginePlacement;
    private String bodyConfiguration;
    private String make;

    public abstract IStrategy accept(IStrategyResolver iStrategyResolver);
}
