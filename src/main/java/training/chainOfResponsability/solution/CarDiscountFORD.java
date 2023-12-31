package training.chainOfResponsability.solution;

import java.math.BigDecimal;

import training.chainOfResponsability.Brand;
import training.chainOfResponsability.Car;

public class CarDiscountFORD extends CarDiscount {

	public CarDiscountFORD (CarDiscount nextDiscount) {
		super(nextDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car car) {
		BigDecimal sellValue = car.getPrice();
		if(Brand.FORD.equals(car.getBrand())) {
			return sellValue.subtract(new BigDecimal(2000));
		}
		return nextDiscount.applyDiscount(car);
	}

	
	
}
