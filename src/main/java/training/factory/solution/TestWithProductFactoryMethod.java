package training.factory.solution;

import training.factory.Product;
import training.factory.ProductTypeEnum;

public class TestWithProductFactoryMethod {
	
	public static void main(String[] args) {
		
		Product digitalProduct = ProductFactory.getInstance(ProductTypeEnum.DIGITAL);
		
		Product physicalProduct = ProductFactory.getInstance(ProductTypeEnum.PHYSICAL);
		
		System.out.println(digitalProduct);

		System.out.println(physicalProduct);
		
	}

}
