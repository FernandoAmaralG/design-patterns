package training.chainOfResponsability.problem;

import java.math.BigDecimal;

import training.chainOfResponsability.Brand;
import training.chainOfResponsability.Car;

public class CarSellService {
	
	public BigDecimal calculateSellValue(Car car) {
		
		BigDecimal sellValue = car.getPrice();
		
		if(Brand.FIAT.equals(car.getBrand())) {
			return sellValue.subtract(new BigDecimal(1000));
		}
		
		if(Brand.FORD.equals(car.getBrand())) {
			return sellValue.subtract(new BigDecimal(2000));
		}
		
		if(car.getPrice().compareTo(new BigDecimal(100000.00)) > 0) {
			return sellValue.subtract(new BigDecimal(10000));
		}
		
		return sellValue;
		
	}

}
