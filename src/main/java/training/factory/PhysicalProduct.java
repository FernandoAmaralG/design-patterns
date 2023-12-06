package training.factory;

public class PhysicalProduct extends Product {

	private Double height;

	private Double width;

	private Double length;

	public Double getHeight() {

		return height;

	}

	public void setHeight(Double height) {

		this.height = height;

	}

	public Double getWidth() {

		return width;

	}

	public void setWidth(Double width) {

		this.width = width;

	}

	public Double getLength() {

		return length;

	}

	public void setLength(Double length) {

		this.length = length;

	}

	@Override
	public String toString() {
		return "PhysicalProduct [descricao=" + super.getDescricao() + ", preco=" + super.getPreco() + ", height=" + height + ", width=" + width + ", length=" + length + "]";
	}

}
