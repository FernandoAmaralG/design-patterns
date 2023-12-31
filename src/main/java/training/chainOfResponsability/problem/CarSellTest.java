package training.chainOfResponsability.problem;

import java.math.BigDecimal;

import training.chainOfResponsability.Brand;
import training.chainOfResponsability.Car;

public class CarSellTest {
	
	public static void main(String[] args) {
		
		CarSellService carSellService = new CarSellService();

		Car car1 = new Car();
		car1.setBrand(Brand.FORD);
		car1.setModel("Fusion");
		car1.setPrice(new BigDecimal(90000.00));
		
		BigDecimal saleValue1 = carSellService.calculateSellValue(car1);
		System.out.println("Sale value Fusion: " + car1.getPrice());
		System.out.println("Sale value Fusion with discount: " + saleValue1);
		
		Car car2 = new Car();
		car2.setBrand(Brand.FIAT);
		car2.setModel("Uno");
		car2.setPrice(new BigDecimal(40000.00));
		
		BigDecimal saleValue2 = carSellService.calculateSellValue(car2);
		System.out.println("Sale value Uno: " + car2.getPrice());
		System.out.println("Sale value Uno with discount: " + saleValue2);
		
		Car car3 = new Car();
		car3.setBrand(Brand.CHEVROLET);
		car3.setModel("Camaro");
		car3.setPrice(new BigDecimal(200000.00));
		
		BigDecimal saleValue3 = carSellService.calculateSellValue(car3);
		System.out.println("Sale value Camaro: " + car3.getPrice());
		System.out.println("Sale value Camaro with discount: " + saleValue3);
		
	}

}
