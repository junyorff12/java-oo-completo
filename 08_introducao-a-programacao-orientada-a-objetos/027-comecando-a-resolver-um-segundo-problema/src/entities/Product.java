package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {

		return price * quantity;
	}

	// O comando 'this' referencia o atributo e n�o o par�metro.
	public void addProducts(int quantity) {

		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {

		this.quantity -= quantity;
	}
}
