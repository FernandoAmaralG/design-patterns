package training.factory.solution;

import training.factory.DigitalProduct;
import training.factory.PhysicalProduct;
import training.factory.Product;
import training.factory.ProductTypeEnum;

public class ProductFactory {

	public static Product getInstance(ProductTypeEnum productTypeEnum) {

		switch (productTypeEnum) {
		case PHYSICAL:
			PhysicalProduct physicalProduct = new PhysicalProduct();
			return physicalProduct;
			
		case DIGITAL:
			DigitalProduct digitalProduct = new DigitalProduct();
			return digitalProduct;
			
		default:
			throw new IllegalArgumentException("Tipo de produto não disponível.");
			
		}			

	}
	
}
