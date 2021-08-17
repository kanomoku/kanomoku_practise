package enum_basic;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class B3_Test {

	@Test
	public void test1() {
		// 自己手动描述的类
		B2_DaySingletonSimulateEnum day = B2_DaySingletonSimulateEnum.SATURDAY;// day类中访问了一个对象 7个
		
		// 枚举类
		// day1--->枚举类型对象 默认继承Object
		// 除了继承Object类的方法外 还有一些 compareTo getDeClearingClass name 说明还默认继承了别的类---Enum
		// 我们自己定义的每一个enum类型 都会默认继承Enum Enum继承Object 所以间接继承Object
		B1_DayEnum day1 = B1_DayEnum.Friday;
		System.out.println(day1.name() + " " + day1.ordinal() + " " + day1.getName() + " " + day1.getIndex());

		B1_DayEnum d = day1.valueOf("Monday");
		System.out.println(d.name() + " " + d.ordinal() + " " + d.getName() + " " + d.getIndex());

		B1_DayEnum[] ds = B1_DayEnum.values();
		for (B1_DayEnum dd : ds) {
			System.out.println(dd.name() + " " + dd.ordinal());
		}
	}

	@Test
	public void test2() {
		// 输入一个字符串monday 输出对应信息
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个星期的单词");
		String key = input.nextLine();
		B1_DayEnum day2 = B1_DayEnum.valueOf(key);
		switch (day2) {// 1.5之前 int byte short char 1.6增加了enum 1.7增加了String
		case Monday:
			System.out.println("星期一");
			break;
		case Tuesday:
			System.out.println("星期二");
			break;
		default:
			System.out.println("默认值");
		}
	}
}
