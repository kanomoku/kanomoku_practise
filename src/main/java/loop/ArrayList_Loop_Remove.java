package loop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * https://blog.csdn.net/yangliangliang2011/article/details/88640653
 */
public class ArrayList_Loop_Remove {

	public ArrayList_Loop_Remove() {
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int n = 10000000;
		while (n > 0) {
			list.add(n);
			n--;
		}
		// 1-10 一共10个

//        int n1 = 1000_0000;
//        for (int i = 0; i < n1; i++) {
//            list.add(i);
//        }

		System.out.println("======== 1 fori 推荐 ==========");
		foriTest(list);
		System.out.println("======== 2 iterator ==========");
		iteratorTest(list);
		System.out.println("======== 3 增强for ==========");
		forBoostTest(list);
		System.out.println("======== 4 forEach 最耗时 java8 ==========");
		forEachTest(list);
		System.out.println("======== 5 stream forEach 比较耗时和增强for差不多 java8 ==========");
		streamForEachTest(list);
		System.out.println("======== 6 parallelStream  java8 ==========");

	}

	// fori循环遍历
	// 这种方式的问题在于，删除某个元素后，list的大小发生了变化，而你的索引也在变化，所以会导致你在遍历的时候漏掉某些元素。
	// 这种方式可以用在删除特定的一个元素时使用，但不适合循环删除多个元素时使用

	// 效率最高 也是java官方推荐的用法
	public static void foriTest(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			Integer a = list.get(i);
		}
	}

	// 增强for循环
	// 删除元素后继续循环会报错误信息ConcurrentModificationException，因为元素在使用的时候发生了并发的修改，导致异常抛出。
	// 但是删除完毕马上使用break跳出，则不会触发报错
	public static void forBoostTest(List<Integer> list) {
		for (int i : list) {
			Integer a = i;
		}
	}

	// iterator 迭代器
	// iterator遍历 可以正常的循环及删除。但要注意的是，使用iterator的remove方法，
	// 如果用list的remove方法同样会报上面提到的ConcurrentModificationException错误
	public static void iteratorTest(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.remove();
			Integer a = (Integer) iterator.next();
		}
	}
	// 以上3中循环的总结：
	// （1）循环删除list中特定一个元素的，可以使用三种方式中的任意一种，但在使用中要注意上面分析的各个问题。
	// （2）循环删除list中多个元素的，应该使用迭代器iterator方式。

	// lambda  学习map未验证
	public static void forEachTest(List<Integer> list) {
		list.removeIf(key -> key == 1);
		list.forEach(item -> {
			Integer a = item;
		});
	}

	// stream foreach java8 特有   学习map未验证
	public static void streamForEachTest(List<Integer> list) {
		list.stream().filter(m -> 1 != m).forEach(item -> {
			Integer a = item;
		});
	}

}
