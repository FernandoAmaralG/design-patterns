package training.chainOfResponsability.solution;

import java.math.BigDecimal;

import training.chainOfResponsability.Car;

public class WithoutDiscount extends CarDiscount {
	
	public WithoutDiscount(CarDiscount nextDiscount) {
		super(nextDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car car) {
		return BigDecimal.ZERO;
	}

	
	
}
