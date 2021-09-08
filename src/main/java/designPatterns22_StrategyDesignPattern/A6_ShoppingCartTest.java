package designPatterns22_StrategyDesignPattern;

public class A6_ShoppingCartTest {

	public static void main(String[] args) {
		
		A5_ShoppingCart cart = new A5_ShoppingCart();

		A4_Item item1 = new A4_Item("1234", 10);
		A4_Item item2 = new A4_Item("5678", 40);

		cart.addItem(item1);
		cart.addItem(item2);

		// pay by paypal
		cart.pay(new A3_PaypalStrategy("myemail@example.com", "mypwd"));

		// pay by credit card
		cart.pay(new A2_CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
	}
}
