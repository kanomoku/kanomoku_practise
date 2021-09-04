package BuiltInFunctionalInterfaces;

import java.util.function.DoublePredicate;

public class C3_DoublePredicate {

	public static void main(String[] args) {
		DoublePredicate doublePredicate = doub -> doub != 0;
		System.out.println(doublePredicate.test(10)); // true

		doublePredicate = doublePredicate.and(doub -> doub < 2);
		System.out.println(doublePredicate.test(1.7)); // true

		doublePredicate = doublePredicate.or(doub -> doub > 2);
		System.out.println(doublePredicate.test(1.7)); // true

		doublePredicate = doublePredicate.negate();
		System.out.println(doublePredicate.test(1.7)); // false
	}

}
