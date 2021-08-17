package enum_basic;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Collectors;

public class C5_Pizza {

	private static EnumSet<C3_PizzaStatus> undeliveredPizzaStatuses = EnumSet.of(C3_PizzaStatus.ORDERED, C3_PizzaStatus.READY);

	private C3_PizzaStatus status;

	public boolean isDeliverable() {
		return this.status.isReady();
	}

	public void printTimeToDeliver() {
		System.out.println("Time to delivery is " + this.getStatus().getTimeToDelivery() + " days");
	}

	public static List<C5_Pizza> getAllUndeliveredPizzas(List<C5_Pizza> input) {
		return input.stream().filter((s) -> undeliveredPizzaStatuses.contains(s.getStatus())).collect(Collectors.toList());
	}

	public static EnumMap<C3_PizzaStatus, List<C5_Pizza>> groupPizzaByStatus(List<C5_Pizza> pizzaList) {
		EnumMap<C3_PizzaStatus, List<C5_Pizza>> pzByStatus = new EnumMap<C3_PizzaStatus, List<C5_Pizza>>(C3_PizzaStatus.class);

		for (C5_Pizza pz : pizzaList) {
			C3_PizzaStatus status = pz.getStatus();
			if (pzByStatus.containsKey(status)) {
				pzByStatus.get(status).add(pz);
			} else {
				List<C5_Pizza> newPzList = new ArrayList<C5_Pizza>();
				newPzList.add(pz);
				pzByStatus.put(status, newPzList);
			}
		}
		return pzByStatus;
	}
	
	public C3_PizzaStatus getStatus() {
		return status;
	}

	public void setStatus(C3_PizzaStatus status) {
		this.status = status;
	}
}
