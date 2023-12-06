package training.factory;

import java.math.BigDecimal;

public class Product {

	private String description;
	
	private BigDecimal price;

	public String getDescricao() {
		return description;
	}

	public void setDescricao(String descricao) {
		this.description = descricao;
	}

	public BigDecimal getPreco() {
		return price;
	}

	public void setPreco(BigDecimal preco) {
		this.price = preco;
	}

	@Override
	public String toString() {
		return "Product [description=" + description + ", price=" + price + "]";
	}
		
}
