package enum_basic;

public class C2_Pizza {

	private C1_PizzaStatus status;

	public boolean isDeliverable() {
		if (getStatus() == C1_PizzaStatus.READY) {
			return true;
		}
		return false;
	}

	public C1_PizzaStatus getStatus() {
		return status;
	}

	public void setStatus(C1_PizzaStatus status) {
		this.status = status;
	}
	
	public int getDeliveryTimeInDays() {
	    switch (status) {
	        case ORDERED: return 5;
	        case READY: return 2;
	        case DELIVERED: return 0;
	    }
	    return 0;
	}
}
