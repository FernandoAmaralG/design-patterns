package training.factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import training.factory.solution.ProductFactory;

class TestWithProductFactoryMethod {

	@Test
	void testDiferenceBetweenPhysicalAndDigitalProductInstance() {
		Product digitalProduct = ProductFactory.getInstance(ProductTypeEnum.DIGITAL);
		Product physicalProduct = ProductFactory.getInstance(ProductTypeEnum.PHYSICAL);
		
		System.out.println(digitalProduct);
		System.out.println(physicalProduct);
	}

}
