package training.chainOfResponsability.solution;

import java.math.BigDecimal;

import training.chainOfResponsability.Brand;
import training.chainOfResponsability.Car;

public class CarDiscountFIAT extends CarDiscount {
	
	public CarDiscountFIAT(CarDiscount nextDiscount) {
		super(nextDiscount);
	}

	@Override
	public BigDecimal applyDiscount(Car car) {
		BigDecimal sellValue = car.getPrice();
		if(Brand.FIAT.equals(car.getBrand())) {
			return sellValue.subtract(new BigDecimal(1000));
		}		
		return nextDiscount.applyDiscount(car);
	}

	
	
}
