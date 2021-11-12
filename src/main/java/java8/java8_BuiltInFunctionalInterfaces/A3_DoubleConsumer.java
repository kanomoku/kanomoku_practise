package java8.java8_BuiltInFunctionalInterfaces;

import java.util.function.DoubleConsumer;

public class A3_DoubleConsumer {

	public static void main(String[] args) {
		DoubleConsumer doubleConsumer = x -> System.out.println("结果a" + x);;
		doubleConsumer.accept(1.3); //结果a1.3

		DoubleConsumer doubleConsumer1 = System.out::println;
		doubleConsumer.andThen(doubleConsumer1).accept(1.3); 
	}
}
