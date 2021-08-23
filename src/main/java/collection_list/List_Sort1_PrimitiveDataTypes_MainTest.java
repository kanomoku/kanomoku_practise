package collection_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class List_Sort1_PrimitiveDataTypes_MainTest {

	// -----------------------第1种----------------------------------------
	@Test
	public void test1() {

		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(10);
		list.add(7);
		list.add(7);
		/**
		 * Collections工具类，升序排:
		 */
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Collections工具类，升序排:·················");

	}

	@Test
	public void test2() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(10);
		list.add(7);
		list.add(7);
		/**
		 * Collections工具类，降序排:
		 */
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("Collections工具类，降序排:·················");
	}

	// -----------------------第2种----------------------------------------
	@Test
	public void test4() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(10);
		list.add(7);
		list.add(7);

		/**
		 * 也可以使用自定义排序如下，效果一样，不过不够简洁
		 */
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		System.out.println(list);
		System.out.println("·················");
	}

	@Test
	public void test5() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(10);
		list.add(7);
		list.add(7);
		/**
		 * 自定义排序，降序排:
		 */
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		System.out.println(list);
		System.out.println("·················");
	}

	// -----------------------第3种----------------------------------------
	@Test
	public void test6() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(10);
		list.add(7);
		list.add(7);
		/**
		 * Lamda 表达式
		 */
		list.sort((a, b) -> a.compareTo(b));
		System.out.println(list);
		list.sort((a, b) -> b.compareTo(a));
		System.out.println(list);
		System.out.println("·················");
	}

	@Test
	public void test3() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(10);
		list.add(7);
		list.add(7);
		System.out.println(list);

		// -----------------------第4种----------------------------------------
		list.sort(Integer::compareTo);
		System.out.println(list);

		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);

		// -----------------------第5种----------------------------------------

		list.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::print);// 升序
		System.out.println();

		list.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::print);// 降序
		System.out.println();
		// -----------------------第6种----------------------------------------
		list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::print);// 升序
		System.out.println();

		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);// 降序
		System.out.println();
	}
	
//  Collections.sort(list); 
//	list.sort(Comparator<? super E> c) 
//	list.stream().sorted(Comparator<? super T> comparator);
	
//	new Comparator<Integer>() {
//		@Override
//		public int compare(Integer o1, Integer o2) {
//			return o2 - o1;
//		}
//	}
	
//  以下三种需要 元素本身继承Comparator<? super T> 并且Override compareTo方法
//	(a, b) -> a.compareTo(b)
	
//	Integer::compareTo
	
//	Comparator.naturalOrder()
//	Comparator.reverseOrder()
}
