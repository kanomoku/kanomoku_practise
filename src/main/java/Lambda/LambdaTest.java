package Lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import org.junit.Test;

public class LambdaTest {

	public static void main(String[] args) {
	}

	@Test
	/*
	 * 语法格式一：无参数，无返回值
	 */
	public void test1() {

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("hello");
			}
		};
		runnable.run();

		Runnable r1 = () -> System.out.println("hello1");
		r1.run();

		System.out.println("**************************************");

		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do");
			}
		}).start();

		new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();
	}

	@Test
	/*
	 * 语法格式二：有一个参数，无返回值 语法
	 * 格式三：若只有一个参数，小括号可以省略不写
	 */
	public void test2() {
		Consumer<String> stringConsumer1 = new Consumer<String>() {
			@Override
			public void accept(String ss) {
				System.out.print(ss);
			}
		};
		stringConsumer1.accept("123");

		Consumer<String> stringConsumer = (a) -> System.out.print(a);
		stringConsumer.accept("123");
	}

	@Test
	/*
	 * 语法格式四：有两个以上的参数，有返回值，并且 Lambda 体中有多条语句
	 * 语法格式五：若 Lambda 体中只有一条语句，return 和 大括号都可以省略不写 
	 * 语法格式六：Lambda 表达式的参数列表的数据类型可以省略不写，因为JVM编译器通过上下文推断出数据类型。
	 */
	public void test3() {
		BinaryOperator<Long> operator = new BinaryOperator<Long>() {
			@Override
			public Long apply(Long a, Long b) {
				return a + b;
			}
		};
		Long a1 = operator.apply(1L, 2L);
		System.out.println(a1);// 3

		BinaryOperator<Long> operators = (a, b) -> {
			return a + b;
		};
		Long a = operators.apply(1L, 2L);
		System.out.println(a);// 3
	}
}
