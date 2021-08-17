package enum_basic;

import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

public class A5_JavaEnumExamples {

	public static void main(String[] args) throws IOException {

		usingEnumMethods();
		System.out.println("---1-------------------");

		usingEnumValueOf();
		System.out.println("---2-------------------");

		usingEnumValues();
		System.out.println("---3-------------------");

		usingEnumInSwitch(A4_ThreadStatesEnum.START);
		System.out.println("---4-------------------");
		usingEnumInSwitch(A4_ThreadStatesEnum.DEAD);
		System.out.println("---5-------------------");

		usingEnumMap();
		System.out.println("---6-------------------");
		usingEnumSet();
		System.out.println("---7-------------------");

	}

	private static void usingEnumSet() {
		EnumSet enumSet = EnumSet.allOf(A4_ThreadStatesEnum.class);
//		for (ThreadStatesEnum tsenum : enumSet) {
//			System.out.println("Using EnumSet, priority = " + tsenum.getPriority());
//		}

		for (Iterator<A4_ThreadStatesEnum> it = enumSet.iterator(); it.hasNext();) {
			System.out.println("Using EnumSet, priority = " + it.next().getPriority());
		}
	}

	private static void usingEnumMap() {
		EnumMap<A4_ThreadStatesEnum, String> enumMap = new EnumMap<A4_ThreadStatesEnum, String>(A4_ThreadStatesEnum.class);
		enumMap.put(A4_ThreadStatesEnum.START, "Thread is started");
		enumMap.put(A4_ThreadStatesEnum.RUNNING, "Thread is running");
		enumMap.put(A4_ThreadStatesEnum.WAITING, "Thread is waiting");
		enumMap.put(A4_ThreadStatesEnum.DEAD, "Thread is dead");

//		Set keySet = enumMap.keySet();
//		for (ThreadStatesEnum key : keySet) {
//			System.out.println("key=" + key.toString() + ":: value=" + enumMap.get(key));
//		}

		for (Map.Entry<A4_ThreadStatesEnum, String> entry : enumMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

	private static void usingEnumInSwitch(A4_ThreadStatesEnum th) {
		switch (th) {
		case START:
			System.out.println("START thread");
			break;
		case WAITING:
			System.out.println("WAITING thread");
			break;
		case RUNNING:
			System.out.println("RUNNING thread");
			break;
		case DEAD:
			System.out.println("DEAD thread");
		}
	}

	private static void usingEnumValues() {
		A4_ThreadStatesEnum[] thArray = A4_ThreadStatesEnum.values();

		for (A4_ThreadStatesEnum th : thArray) {
			System.out.println(th.toString() + "::priority=" + th.getPriority());
		}
	}

	private static void usingEnumValueOf() {
		A4_ThreadStatesEnum th = Enum.valueOf(A4_ThreadStatesEnum.class, "START");
		System.out.println("th priority=" + th.getPriority());
	}

	private static void usingEnumMethods() throws IOException {
		A4_ThreadStatesEnum thc = A4_ThreadStatesEnum.DEAD;
		System.out.println("priority is:" + thc.getPriority());

		thc = A4_ThreadStatesEnum.DEAD;
		System.out.println("Using overriden method." + thc.toString());

		thc = A4_ThreadStatesEnum.START;
		System.out.println("Using overriden method." + thc.toString());
		thc.setPriority(10);
		System.out.println("Enum Constant variable changed priority value=" + thc.getPriority());

		thc.close();
	}

}
