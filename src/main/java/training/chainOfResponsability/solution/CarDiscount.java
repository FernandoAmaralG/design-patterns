package training.chainOfResponsability.solution;

import java.math.BigDecimal;

import training.chainOfResponsability.Car;

public abstract class CarDiscount {
	
	protected CarDiscount nextDiscount;

	public CarDiscount(CarDiscount nextDiscount) {
		this.nextDiscount = nextDiscount;
	}
	
	public abstract BigDecimal applyDiscount(Car car);

}
