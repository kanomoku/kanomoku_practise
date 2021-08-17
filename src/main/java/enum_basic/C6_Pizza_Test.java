package enum_basic;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

import org.junit.jupiter.api.Test;

public class C6_Pizza_Test {

	@Test
	public void givenPizaOrder_whenReady_thenDeliverable() {
		C4_Pizza testPz = new C4_Pizza();
		testPz.setStatus(C3_PizzaStatus.READY);
		assertTrue(testPz.isDeliverable());
	}

	@Test
	public void givenPizaOrder_whenOrder_thenDeliverable() {
		C4_Pizza testPz1 = new C4_Pizza();
		testPz1.setStatus(C3_PizzaStatus.ORDERED);
		assertTrue(testPz1.isDeliverable());
	}

	@Test
	public void givenPizaOrder_whenDeliverd_thenDeliverable2() {
		C4_Pizza testPz2 = new C4_Pizza();
		testPz2.setStatus(C3_PizzaStatus.DELIVERED);
		assertTrue(testPz2.isDeliverable());
	}

	@Test
	public void givenPizaOrders_whenRetrievingUnDeliveredPzs_thenCorrectlyRetrieved() {
		List<C5_Pizza> pzList = new ArrayList<>();
		C5_Pizza pz1 = new C5_Pizza();
		pz1.setStatus(C3_PizzaStatus.DELIVERED);

		C5_Pizza pz2 = new C5_Pizza();
		pz2.setStatus(C3_PizzaStatus.ORDERED);

		C5_Pizza pz3 = new C5_Pizza();
		pz3.setStatus(C3_PizzaStatus.ORDERED);

		C5_Pizza pz4 = new C5_Pizza();
		pz4.setStatus(C3_PizzaStatus.READY);

		pzList.add(pz1);
		pzList.add(pz2);
		pzList.add(pz3);
		pzList.add(pz4);
		System.out.println(pzList.size());

		List<C5_Pizza> undeliveredPzs = C5_Pizza.getAllUndeliveredPizzas(pzList);
		assertTrue(undeliveredPzs.size() == 3);
	}
	
	@Test
	public void givenPizaOrders_whenGroupByStatusCalled_thenCorrectlyGrouped() {
	    List<C5_Pizza> pzList = new ArrayList<>();
	    C5_Pizza pz1 = new C5_Pizza();
	    pz1.setStatus(C3_PizzaStatus.DELIVERED);

	    C5_Pizza pz2 = new C5_Pizza();
	    pz2.setStatus(C3_PizzaStatus.ORDERED);

	    C5_Pizza pz3 = new C5_Pizza();
	    pz3.setStatus(C3_PizzaStatus.ORDERED);

	    C5_Pizza pz4 = new C5_Pizza();
	    pz4.setStatus(C3_PizzaStatus.READY);

	    pzList.add(pz1);
	    pzList.add(pz2);
	    pzList.add(pz3);
	    pzList.add(pz4);

	    EnumMap<C3_PizzaStatus,List<C5_Pizza>> map = C5_Pizza.groupPizzaByStatus(pzList);
	    assertTrue(map.get(C3_PizzaStatus.DELIVERED).size() == 1);
	    assertTrue(map.get(C3_PizzaStatus.ORDERED).size() == 2);
	    assertTrue(map.get(C3_PizzaStatus.READY).size() == 1);
	}

}
