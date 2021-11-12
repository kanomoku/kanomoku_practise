package java8.java8_BuiltInFunctionalInterfaces;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class D1_Function {

	/**
	 * Function测试，function的作用是转换，将一个值转为另外一个值
	 */
	public static void main(String[] args) {
		// ① 使用map方法，泛型的第一个参数是转换前的类型，第二个是转化后的类型
		Function<String, Integer> function = new Function<String, Integer>() {
			@Override
			public Integer apply(String s) {
				return s.length();// 获取每个字符串的长度，并且返回
			}
		};
		Stream<String> stream = Stream.of("aaa", "bbbbb", "ccccccv");
		Stream<Integer> stream1 = stream.map(function);
		stream1.forEach(System.out::println);
	}

	@Test
	public void test1() {
		D1_Function functionTest = new D1_Function();
		System.out.println(functionTest.compute1(5, i -> i * 2, i -> i * i));// 50
		System.out.println(functionTest.compute2(5, i -> i * 2, i -> i * i));// 100
		System.out.println(functionTest.compute3(5, i -> i * 2, i -> i * i));// 50
		System.out.println(functionTest.compute4(5, i -> i * 2, i -> i * i));// 100
	}

	public int compute1(int i, Function<Integer, Integer> after, Function<Integer, Integer> before) {
		return after.compose(before).apply(i);/// 50
	}

	public int compute2(int i, Function<Integer, Integer> before, Function<Integer, Integer> after) {
		return after.compose(before).apply(i);/// 100
	}

	public int compute3(int i, Function<Integer, Integer> after, Function<Integer, Integer> before) {
		return before.andThen(after).apply(i);/// 50
	}

	public int compute4(int i, Function<Integer, Integer> before, Function<Integer, Integer> after) {
		return before.andThen(after).apply(i);/// 100
	}
	
	@Test
	public void test2() {
		// 定义一个function 输入是String类型，输出是 person 类型， person是一个类。
		Function<String, Person> function = b -> {
			Person a = new Person();
		    a.setName(b);
		    return a;
		};
		
		String[] testintStrings = { "1", "2", "3", "4" };
		// 将String的Array转换成map
		Map<String, Person> eventmap1 = Stream.of(testintStrings).collect(Collectors.toMap(inputvalue -> inputvalue + "ok", inputvalue -> function.apply(inputvalue)));
		///{4ok=test.person@61a52fbd, 1ok=test.person@233c0b17, 2ok=test.person@63d4e2ba, 3ok=test.person@7bb11784}

		///如果Collectors.toMap的转换过程很简单，比如输入和输出类型相同，则不需要另外定义Function,例如：
		String[] testintStrings1 = { "1", "2", "3", "4" };
		Map<String, String> eventmap2 = Stream.of(testintStrings1).collect(Collectors.toMap(inputvalue -> inputvalue, inputvalue -> (inputvalue + "a")));
		///{1=1a, 2=2a, 3=3a, 4=4a}
	}

	
}
class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
