package training.prototype.problem;

import training.prototype.BorderTypeEnum;
import training.prototype.Button;

public class YellowButton extends Button {

	public YellowButton() {
		setColor("Yellow");
		setWidth(40);
		setHeight(100);
		setBorderType(BorderTypeEnum.DASHED);
	}
	
}
