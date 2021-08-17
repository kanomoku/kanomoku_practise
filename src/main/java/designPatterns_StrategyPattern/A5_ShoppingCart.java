package designPatterns_StrategyPattern;

import java.util.ArrayList;
import java.util.List;

public class A5_ShoppingCart {

	List<A4_Item> items;

	public A5_ShoppingCart() {
		this.items = new ArrayList<A4_Item>();
	}

	public void addItem(A4_Item item) {
		this.items.add(item);
	}

	public void removeItem(A4_Item item) {
		this.items.remove(item);
	}

	public int calculateTotal() {
		int sum = 0;
		for (A4_Item item : items) {
			sum += item.getPrice();
		}
		return sum;
	}

	public void pay(A1_PaymentStrategy paymentMethod) {
		int amount = calculateTotal();
		paymentMethod.pay(amount);
	}
}