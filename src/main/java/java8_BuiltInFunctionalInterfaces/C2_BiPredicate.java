package java8_BuiltInFunctionalInterfaces;

import java.util.function.BiPredicate;

public class C2_BiPredicate {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> biPredicate = (a, b) -> a != b;
		System.out.println(biPredicate.test(1, 2)); // true

		biPredicate = (a, b) -> a < b;
		biPredicate = biPredicate.and((a, b) -> a + b < 5);
		System.out.println(biPredicate.test(1, 2)); // true

		biPredicate = (a, b) -> a < b;
		biPredicate = biPredicate.or((a, b) -> a > b);
		System.out.println(biPredicate.test(1, 1)); // false

		biPredicate = (a, b) -> a < b;
		biPredicate = biPredicate.negate();
		System.out.println(biPredicate.test(3, 2)); // true
	}

}
