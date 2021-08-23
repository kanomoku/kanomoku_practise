package collection_loop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * https://blog.csdn.net/yangliangliang2011/article/details/88640653
 */
public class ArrayList_Loop {

	// 1.fori循环遍历
	// 效率最高 也是java官方推荐的用法
	@Test()
	public void foriTest() {
		List<Integer> list = new ArrayList<>();
		int n = 10000000;
		while (n > 0) {
			list.add(n);
			n--;
		}
		long before = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			Integer a = list.get(i);
		}
		long after = System.currentTimeMillis();
		System.out.println("for i time=\t" + (after - before));
	}

	// 2.增强for循环
	@Test()
	public void forBoostTest() {
		List<Integer> list = new ArrayList<>();
		int n = 10000000;
		while (n > 0) {
			list.add(n);
			n--;
		}
		long before = System.currentTimeMillis();
		for (int i : list) {
			Integer a = i;
		}
		long after = System.currentTimeMillis();
		System.out.println("for Boost time=\t" + (after - before));
	}

	// 3.iterator 迭代器
	@Test()
	public void iteratorTest() {
		List<Integer> list = new ArrayList<>();
		int n = 10000000;
		while (n > 0) {
			list.add(n);
			n--;
		}
		long before = System.currentTimeMillis();
		for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
			Integer a = (Integer) iterator.next();
		}
		long after = System.currentTimeMillis();
		System.out.println("iterator for time=\t" + (after - before));

		before = System.currentTimeMillis();
		// while 循环写法
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer a = (Integer) iterator.next();
		}
		after = System.currentTimeMillis();
		System.out.println("iterator while time=\t" + (after - before));
	}

	// 4.lambda
	// lambda 最慢不推荐 java8 lambda
	@Test()
	public void forEachTest() {
		List<Integer> list = new ArrayList<>();
		int n = 10000000;
		while (n > 0) {
			list.add(n);
			n--;
		}
		long before = System.currentTimeMillis();
		list.forEach(item -> {
			Integer a = item;
		});
		long after = System.currentTimeMillis();
		System.out.println("lambda time=\t" + (after - before));
	}

	// 5.stream foreach java8 特有
	@Test()
	public void streamForEachTest() {
		List<Integer> list = new ArrayList<>();
		int n = 10000000;
		while (n > 0) {
			list.add(n);
			n--;
		}
		long before = System.currentTimeMillis();
		list.stream().forEach(item -> {
			Integer a = item;
		});
		long after = System.currentTimeMillis();
		System.out.println("list.stream().forEach time=\t" + (after - before));
	}

	// 6.parallelStream foreach java8 特有
	@Test()
	public void parallelStreamForEachTest() {
		List<Integer> list = new ArrayList<>();
		int n = 10000000;
		while (n > 0) {
			list.add(n);
			n--;
		}
		long before = System.currentTimeMillis();
		list.parallelStream().forEach(item -> {
			Integer a = item;
		});
		long after = System.currentTimeMillis();
		System.out.println("list.parallelStream().forEach time=\t" + (after - before));
	}
}
