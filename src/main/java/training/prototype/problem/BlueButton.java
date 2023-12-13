package training.prototype.problem;

import training.prototype.BorderTypeEnum;
import training.prototype.Button;

public class BlueButton extends Button {
	
	public BlueButton() {
		setColor("Blue");
		setWidth(35);
		setHeight(125);
		setBorderType(BorderTypeEnum.DASHED);
	}

}
