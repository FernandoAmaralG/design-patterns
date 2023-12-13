package training.prototype.problem;

import training.prototype.BorderTypeEnum;
import training.prototype.Button;

public class RedButton extends Button {

	public RedButton() {
		setColor("Red");
		setWidth(30);
		setHeight(100);
		setBorderType(BorderTypeEnum.THIN);
	}
	
}
