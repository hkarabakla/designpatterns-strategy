package com.hk.strategy;


import com.hk.model.Vechile;

public interface IStrategy <T extends Vechile> {

    void build(T t);
}
