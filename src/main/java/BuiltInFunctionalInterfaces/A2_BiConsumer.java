package BuiltInFunctionalInterfaces;

import java.util.function.BiConsumer;

public class A2_BiConsumer {

	//提供两个自定义类型的输入参数,不返回执行结果
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		BiConsumer<String, String> biConsumer = (a, b) -> {
			sb.append(a);
			sb.append(b);
		};
		biConsumer.accept("Hello ", "Jack!");
		System.out.println(sb.toString()); // Hello Jack!

		BiConsumer<String, String> biConsumer1 = (a, b) -> {
			System.out.println(a + b);
		};
		biConsumer.andThen(biConsumer1).accept("Hello", " Jack!"); // Hello Jack!
	}
}
