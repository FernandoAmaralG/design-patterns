package training.prototype;

public class Button {

	private String color;
	
	private int width;
	
	private int height;
	
	protected BorderTypeEnum borderType;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public BorderTypeEnum getBorderType() {
		return borderType;
	}

	public void setBorderType(BorderTypeEnum borderType) {
		this.borderType = borderType;
	}

	@Override
	public String toString() {
		return "Button [color=" + color + ", width=" + width + ", height=" + height + ", borderType=" + borderType
				+ "]";
	}
		
}
