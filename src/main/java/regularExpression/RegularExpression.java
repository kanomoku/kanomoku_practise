package regularExpression;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	@Test
	public void test1() {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
		// 判断输入的str字符串内容是否满足什么样的格式
		System.out.println("ab 匹配 a[abc]：" + "ab".matches("a[abc]"));// 字符串长度为2，第一个必须是a 第二个是abc中的任意一个
		System.out.println("abc 匹配 a[abc]：" + "abc".matches("a[abc]"));// 字符串长度为2，第一个必须是a 第二个是abc中的任意一个
		System.out.println("ad 匹配 a[abc]：" + "ad".matches("a[abc]"));// 字符串长度为2，第一个必须是a 第二个是abc中的任意一个
		System.out.println("···························");
		System.out.println("ab 匹配 a[^abc]：" + "ab".matches("a[^abc]"));// 字符串长度为2,，第一个必须是a 第二个不是abc中的任意一个
		System.out.println("abc 匹配 a[^abc]：" + "abc".matches("a[^abc]"));// 字符串长度为2,，第一个必须是a 第二个不是abc中的任意一个
		System.out.println("ad 匹配 a[^abc]：" + "ad".matches("a[^abc]"));// 字符串长度为2,，第一个必须是a 第二个不是abc中的任意一个
		System.out.println("···························");
		System.out.println("ab 匹配 a[^abc]：" + "ab".matches("a[a-zA-Z]"));// 字符串长度为2，第一个必须是a 第二个任意范围之内的一个字母
		System.out.println("aB 匹配 a[^abc]：" + "aB".matches("a[a-zA-Z]"));// 字符串长度为2，第一个必须是a 第二个任意范围之内的一个字母
		System.out.println("aBc 匹配 a[^abc]：" + "aBc".matches("a[a-zA-Z]"));// 字符串长度为2，第一个必须是a 第二个任意范围之内的一个字母
		System.out.println("a1 匹配 a[^abc]：" + "a1".matches("a[a-zA-Z]"));// 字符串长度为2，第一个必须是a 第二个任意范围之内的一个字母
		System.out.println("···························");
		System.out.println("ad".matches("a[a-z&&[^bc]]"));// 字符串长度是2，第一个必须是a 第二个a-z都可以但是不能是b和c
		System.out.println("ab".matches("a[a-z&&[^bc]]"));// 字符串长度是2，第一个必须是a 第二个a-z都可以但是不能是b和c
		System.out.println("adc".matches("a[a-z&&[^bc]]"));// 字符串长度是2，第一个必须是a 第二个a-z都可以但是不能是b和c
		System.out.println("···························");
		System.out.println("ad".matches(".[a-z&&[^bc]]"));// 字符串长度为2，第一个点代表任意字符 第二个a-z都可以但是不能是b和c
		System.out.println("adc".matches(".[a-z&&[^bc]]"));// 字符串长度为2，第一个点代表任意字符 第二个a-z都可以但是不能是b和c
		System.out.println("ac".matches(".[a-z&&[^bc]]"));// 字符串长度为2，第一个点代表任意字符 第二个a-z都可以但是不能是b和c
		System.out.println("···························");
		System.out.println("m".matches("[a-d[m-p]]"));// 字符串长度为1，范围内的字符
		System.out.println("a".matches("[a-d[m-p]]"));// 字符串长度为1，范围内的字符
		System.out.println("e".matches("[a-d[m-p]]"));// 字符串长度为1，范围内的字符
		System.out.println("mm".matches("[a-d[m-p]]"));// 字符串长度为1，范围内的字符
		System.out.println("···························");
		System.out.println("a".matches("[a-z&&[def]]"));// 字符串长度为1，范围a-z,而且范围是def
		System.out.println("d".matches("[a-z&&[def]]"));// 字符串长度为1，范围a-z,而且范围是def
		System.out.println("e".matches("[a-z&&[def]]"));// 字符串长度为1，范围a-z,而且范围是def
		System.out.println("ef".matches("[a-z&&[def]]"));// 字符串长度为1，范围a-z,而且范围是def
		System.out.println("···························");
		System.out.println("12".matches("\\d{3,5}"));// 数字，长度为3-5个
		System.out.println("123".matches("\\d{3,5}"));// 数字，长度为3-5个
		System.out.println("12345".matches("\\d{3,5}"));// 数字，长度为3-5个
		System.out.println("123456".matches("\\d{3,5}"));// 数字，长度为3-5个
		System.out.println("a".matches("\\d{3,5}"));// 数字，长度为3-5个
		System.out.println("···························");
	}

	@Test
	public void test2() {
		String str = "a-b-c-d";
		String[] ss1 = str.split("-");
		for (String s : ss1) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("···························");

		String str1 = "a,.b+c#d";
		String[] ss = str1.split(",|\\+|#"); // a .b c d
		for (String s : ss) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("···························");

		// 所有的字符串中找寻满足如下规则的信息 邮政编码
		String str2 = "123456abc0123456abc1234567abc";
		// 1.利用Pattern类创建一个模式 理解为是一个正则表达式对象
		Pattern pattern = Pattern.compile("\\d{6}");// 邮编
		// 2.需要提供一个字符串
		// 3.利用pattern模式对象创建一个匹配器
		Matcher matcher = pattern.matcher(str2);
		// 4.找寻字符串中出现满足上述格式的字符串
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
////        123456
////        012345
////        123456
	}

	@Test
	public void test_d() {
		System.out.println("01".matches("\\d"));
		System.out.println("0".matches("\\d"));
	}
	@Test
	public void test_s() {
		System.out.println("".matches("\\s"));
		System.out.println(" ".matches("\\s"));
		System.out.println("\n".matches("\\s"));
		System.out.println("\t".matches("\\s"));
	}
	@Test
	public void test_dot() {
		System.out.println("".matches("."));
		System.out.println(" ".matches("."));
		System.out.println("\n".matches("."));
		System.out.println("\t".matches("."));
		System.out.println("\f".matches("."));
	}
	@Test
	public void test_sS() {
		System.out.println("".matches("[\\s\\S]"));
		System.out.println(" ".matches("[\\s\\S]"));
		System.out.println("\n".matches("[\\s\\S]"));
		System.out.println("\t".matches("[\\s\\S]"));
		System.out.println("\f".matches("[\\s\\S]"));
	}
}
