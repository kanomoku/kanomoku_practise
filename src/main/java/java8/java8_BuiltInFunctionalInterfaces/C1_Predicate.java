package java8.java8_BuiltInFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class C1_Predicate {

	public static void main(String[] args) {

		/// Predicate 和 stream 的 filter 配合
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<Integer> result = C1_Predicate.conditionFilter(list, integer -> integer > 5);/// 6,7,8,9,10
		result = C1_Predicate.conditionFilter(list, integer -> integer >= 5);/// 5,6,7,8,9,10
		result = C1_Predicate.conditionFilter(list, integer -> integer < 8);/// 1,2,3,4,5,6,7
		result = C1_Predicate.conditionFilter(list, integer -> true);/// 1,2,3,4,5,6,7,8,9,10
		
		// 大于5并且是偶数
		result = C1_Predicate.conditionFilterAnd(list, integer -> integer > 5, integer1 -> integer1 % 2 == 0);// 6 8 10
		
		// 大于5或者是偶数
		result = C1_Predicate.conditionFilterOr(list, integer -> integer > 5, integer1 -> integer1 % 2 == 0);// 2 4 6 8 9
																												 
		// 条件取反
		result = C1_Predicate.conditionFilterNegate(list, integer2 -> integer2 > 5);// 1 2 3 4 5

		// isEqual方法返回类型也是Predicate，也就是说通过isEqual方法得到的也是一个用来进行条件判断的函数式接口实例。
		// 而返回的这个函数式接口实例是通过传入的targetRef的equals方法进行判断的。
		System.out.println(Predicate.isEqual("test").test("test"));// true

	}

	// 按照条件筛选
	public static List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate) {
		return list.stream().filter(predicate).collect(Collectors.toList());
	}

	// and方法接收一个Predicate类型，也就是将传入的条件和当前条件以并且的关系过滤数据。
	public static List<Integer> conditionFilterAnd(List<Integer> list, Predicate<Integer> predicate,
			Predicate<Integer> predicate2) {
		return list.stream().filter(predicate.and(predicate2)).collect(Collectors.toList());
	}

	// or方法同样接收一个Predicate类型，将传入的条件和当前的条件以或者的关系过滤数据。
	public static List<Integer> conditionFilterOr(List<Integer> list, Predicate<Integer> predicate,
			Predicate<Integer> predicate2) {
		return list.stream().filter(predicate.or(predicate2)).collect(Collectors.toList());
	}
	
	// negate就是将当前条件取反。
	public static List<Integer> conditionFilterNegate(List<Integer> list, Predicate<Integer> predicate) {
		return list.stream().filter(predicate.negate()).collect(Collectors.toList());
	}



	/** * Predicate谓词测试，谓词其实就是一个判断的作用类似bool的作用 */
	@Test
	public void test_Predicate() {
		// ① 使用Predicate接口实现方法,只有一个test方法，传入一个参数，返回一个bool值
		Predicate<Integer> predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer integer) {
				if (integer > 5) {
					return true;
				}
				return false;
			}
		};
		System.out.println(predicate.test(6));
		// ② 使用lambda表达式，
		predicate = (t) -> t > 5;
		boolean res = predicate.test(1);
		System.out.println(res);

		System.out.println("********************");
	}

	/** *Predicate谓词测试，Predicate作为接口使用 */
	@Test
	public void test_Predicate2() {
		// ①将Predicate作为filter接口，Predicate起到一个判断的作用
		Predicate<Integer> predicate = new Predicate<Integer>() {
			@Override
			public boolean test(Integer integer) {
				if (integer > 5) {
					return true;
				}
				return false;
			}
		};

		Stream<Integer> stream = Stream.of(1, 23, 3, 4, 5, 56, 6, 6);
		List<Integer> list = stream.filter(predicate).collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
