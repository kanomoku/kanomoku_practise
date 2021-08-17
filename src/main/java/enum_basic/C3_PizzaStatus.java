package enum_basic;

public enum C3_PizzaStatus {
	ORDERED(5) {
		@Override
		public boolean isOrdered() {
			return true;
		}
	},
	READY(2) {
		@Override
		public boolean isReady() {
			return true;
		}
	},
	DELIVERED(0) {
		@Override
		public boolean isDelivered() {
			return true;
		}
	};

	private int timeToDelivery;

	private C3_PizzaStatus(int timeToDelivery) {
		this.timeToDelivery = timeToDelivery;
	}

	public boolean isOrdered() {
		return false;
	}

	public boolean isReady() {
		return false;
	}

	public boolean isDelivered() {
		return false;
	}

	public int getTimeToDelivery() {
		return timeToDelivery;
	}
}
