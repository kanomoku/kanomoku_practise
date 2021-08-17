package enum_basic;

public enum C7_PizzaDeliverySystemConfiguration {
	INSTANCE;
	private PizzaDeliveryStrategy deliveryStrategy = PizzaDeliveryStrategy.ORDERED;

	private C7_PizzaDeliverySystemConfiguration() {
	}

	public static C7_PizzaDeliverySystemConfiguration getInstance() {
		return INSTANCE;
	}

	public PizzaDeliveryStrategy getDeliveryStrategy() {
		return deliveryStrategy;
	}

	public enum PizzaDeliveryStrategy {
		ORDERED, READY, DELIVERED
	}
}
