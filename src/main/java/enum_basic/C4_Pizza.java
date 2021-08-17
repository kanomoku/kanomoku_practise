package enum_basic;

public class C4_Pizza {

    private C3_PizzaStatus status;
    public C3_PizzaStatus getStatus() {
		return status;
	}
	public void setStatus(C3_PizzaStatus status) {
		this.status = status;
	}

    public boolean isDeliverable() {
        return this.status.isReady();
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " + this.getStatus().getTimeToDelivery());
    }
    
}