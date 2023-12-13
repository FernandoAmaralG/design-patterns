package training.prototype.solution;

import training.prototype.Button;

public class TestButtonPrototype {

	public static void main(String[] args) {
		
		ButtonRegistry registry = ButtonRegistry.getInstance();
		
		Button redButton = registry.getButton("RED_BUTTON");
		System.out.println(redButton);
		
		Button blueButton = registry.getButton("BLUE_BUTTON");
		System.out.println(blueButton);
		
		Button yellowButton = registry.getButton("YELLOW_BUTTON");
		System.out.println(yellowButton);
		
	}
	
}
