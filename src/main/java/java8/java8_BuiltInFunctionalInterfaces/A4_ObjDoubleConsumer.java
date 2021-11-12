package java8.java8_BuiltInFunctionalInterfaces;

import java.util.function.ObjDoubleConsumer;

public class A4_ObjDoubleConsumer {

	public static void main(String[] args) {
		ObjDoubleConsumer<String> doubleConsumer = (aaa, bbb) -> System.out.println(aaa + bbb);
		doubleConsumer.accept("金额：", 222.66); // 金额：222.66
	}
}
