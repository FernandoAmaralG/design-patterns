package training.chainOfResponsability.solution;

import java.math.BigDecimal;

import training.chainOfResponsability.Car;

public class CarDiscountValueBiggerThenHundredThousand extends CarDiscount {
	
	public CarDiscountValueBiggerThenHundredThousand(CarDiscount nextDiscount) {
		super(nextDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car car) {
		BigDecimal sellValue = car.getPrice();
		if(car.getPrice().compareTo(new BigDecimal(100000.00)) > 0) {
			return sellValue.subtract(new BigDecimal(10000));
		}
		return nextDiscount.applyDiscount(car);
	}
}
