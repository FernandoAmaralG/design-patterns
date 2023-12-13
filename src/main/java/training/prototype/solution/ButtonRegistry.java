package training.prototype.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import training.prototype.BorderTypeEnum;
import training.prototype.Button;

public class ButtonRegistry {

	private static ButtonRegistry buttonRegistry;
	
	private static Map<String, Button> REGISTRY = new HashMap<>();
	
	static {
		Button yellowButton = new Button();
		yellowButton.setColor("Yellow");
		yellowButton.setWidth(40);
		yellowButton.setHeight(100);
		yellowButton.setBorderType(BorderTypeEnum.DASHED);
		
		Button blueButton = new Button();
		blueButton.setColor("Blue");
		blueButton.setWidth(35);
		blueButton.setHeight(125);
		blueButton.setBorderType(BorderTypeEnum.DASHED);
		
		Button redButton = new Button();
		redButton.setColor("Red");
		redButton.setWidth(30);
		redButton.setHeight(100);
		redButton.setBorderType(BorderTypeEnum.THIN);
		
		REGISTRY.put("YELLOW_BUTTON", yellowButton);
		REGISTRY.put("BLUE_BUTTON", blueButton);
		REGISTRY.put("RED_BUTTON", redButton);
	}
	
	public static ButtonRegistry getInstance() {
		if(Objects.isNull(buttonRegistry)) {
			buttonRegistry = new ButtonRegistry();
			return buttonRegistry;
		}
		return buttonRegistry;
	}
	
	public Button getButton(String key) {
		return ButtonFactory.getInstance(REGISTRY.get(key));
	}
	
	public static void addRegistry(String key, Button button) {
		REGISTRY.put(key, button);
	}
	
}
