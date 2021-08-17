package enum_basic;

public class A3_DifferenceBetweenEnumAndContant {

	public A3_DifferenceBetweenEnumAndContant() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This method shows the benefit of using Enum over Constants
	 */
	private static void benefitsOfEnumOverConstants() {
		// Enum values are fixed
		simpleEnumExample(A1_ThreadStates.START);
		simpleEnumExample(A1_ThreadStates.WAITING);
		simpleEnumExample(A1_ThreadStates.RUNNING);
		simpleEnumExample(A1_ThreadStates.DEAD);
		simpleEnumExample(null);

		simpleConstantsExample(1);
		simpleConstantsExample(2);
		simpleConstantsExample(3);
		simpleConstantsExample(4);
		// we can pass any int constant
		simpleConstantsExample(5);
	}

	private static void simpleEnumExample(A1_ThreadStates th) {
		if (th == A1_ThreadStates.START)
			System.out.println("Thread started");
		else if (th == A1_ThreadStates.WAITING)
			System.out.println("Thread is waiting");
		else if (th == A1_ThreadStates.RUNNING)
			System.out.println("Thread is running");
		else
			System.out.println("Thread is dead");
	}

	private static void simpleConstantsExample(int i) {
		if (i == A2_ThreadStatesConstant.START)
			System.out.println("Thread started");
		else if (i == A2_ThreadStatesConstant.WAITING)
			System.out.println("Thread is waiting");
		else if (i == A2_ThreadStatesConstant.RUNNING)
			System.out.println("Thread is running");
		else
			System.out.println("Thread is dead");
	}

}
