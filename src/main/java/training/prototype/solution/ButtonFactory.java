package training.prototype.solution;

import training.prototype.Button;

public class ButtonFactory {

	public static Button getInstance(Button prototype) {
		
		Button clone = new Button();
		clone.setColor(prototype.getColor());
		clone.setWidth(prototype.getWidth());
		clone.setHeight(prototype.getHeight());
		clone.setBorderType(prototype.getBorderType());
		
		return clone;
		
	}
	
	

}
