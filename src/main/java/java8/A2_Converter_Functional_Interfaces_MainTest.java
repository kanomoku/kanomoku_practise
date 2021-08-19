package java8;

public class A2_Converter_Functional_Interfaces_MainTest {
	public static void main(String[] args) {

		// 将数字字符串转换为整数类型
		A2_Converter_Functional_Interfaces<String, Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted.getClass()); // class java.lang.Integer
	}

}
