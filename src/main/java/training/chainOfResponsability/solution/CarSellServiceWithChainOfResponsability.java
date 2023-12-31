package training.chainOfResponsability.solution;

import java.math.BigDecimal;

import training.chainOfResponsability.Car;

public class CarSellServiceWithChainOfResponsability {

	public BigDecimal calculateSellValue(Car car) {

		CarDiscount discount = 
				new CarDiscountFIAT(
						new CarDiscountFORD(
								new CarDiscountValueBiggerThenHundredThousand(
										new WithoutDiscount(null)
								)));
		
		return discount.applyDiscount(car);
	}

}
