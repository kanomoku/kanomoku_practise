package java8_BuiltInFunctionalInterfaces;

import java.util.Optional;

public class E1_Optional {

	public static void main(String[] args) {
		String str = "hello";
		Optional<String> optional = Optional.ofNullable(str);
		optional.ifPresent(s -> System.out.println(s));//value为hello，正常输出
		
		
		String str1 = null;
		Optional<String> optional1 = Optional.ofNullable(str1);
		System.out.println(optional1.orElseGet(() -> "welcome"));//welcome
	}
}
