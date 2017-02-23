package com.hk;

import com.hk.model.Car;
import com.hk.model.MotorBike;
import com.hk.model.Truck;
import com.hk.strategy.IStrategy;
import com.hk.strategy.impl.VechileBuilderStrategyResolver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignpatternsApplicationTests {

	@Autowired
	private VechileBuilderStrategyResolver vechileBuilderStrategyResolver;

	@Test
	public void contextLoads() {

		Car car = new Car();
		Truck truck = new Truck();
		MotorBike motorBike = new MotorBike();

		IStrategy carBuilderStrategy = car.accept(vechileBuilderStrategyResolver);
		carBuilderStrategy.build(car);

		IStrategy truckBuilderStrategy = truck.accept(vechileBuilderStrategyResolver);
		truckBuilderStrategy.build(truck);

		IStrategy motorBikeBuilderStrategy = motorBike.accept(vechileBuilderStrategyResolver);
		motorBikeBuilderStrategy.build(motorBike);
	}

}
