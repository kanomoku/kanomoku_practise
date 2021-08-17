package string;

public class StringPool {

	public StringPool() {
	}

	public static void main(String[] args) {

		System.out.println("-----1------------------------------------------");

		String str1 = "abc"; // 先检查字符串常量池中有没有"abc"，如果字符串常量池中没有，则创建一个，然后 s1 指向字符串常量池中的对象，如果有，则直接将 s1指向"abc"；
		String str2 = "abc"; // 存储在常量区里和上面是一个
		String str3 = new String("abc");// 堆内存里创建了一个对象
		String str4 = new String("abc");// 堆内存里创建了一个对象
		System.out.println(str1 == str2);// true 因为是指向常量区里同一个常量
		System.out.println(str1 == str3);// false 不是同一个对象
		System.out.println(str3 == str4);// false 不是同一个对象
		System.out.println(str1.equals(str2));// true String把equal方法重写了--现在比较的是字符值
		System.out.println(str1.equals(str3));// true
		System.out.println(str3.equals(str4));// true

		System.out.println("-----2------------------------------------------");

		String s1 = "abc";
		String s2 = "abc";
		String s3 = s1 + s2;
		String s4 = "abc" + "abc";
		String s5 = "ab" + "cabc";
		System.out.println(s3 == s4);//false
		System.out.println(s4 == s5);//true
//		String s4 = "abc" + "abc"是常量运算表达式 constant expression。编译器就可以计算出值了，这就是编译时计算。同时这个表达式会被看做是string literal。
//		String s3 = s1+s2；那么s3的值就只能在运行的时候才能确定，这就是运行时计算。可见运行时会创建一个新的String，并且不会被当成string literal。 

		System.out.println("-----3------------------------------------------");

		String ss1 = "abc";
		String ss2 = "abc";
		String ss3 = ss1 + ss2;
		String ss4 = ss3.intern();
		String ss5 = "ab" + "cabc";
		System.out.println(ss4 == ss5);//true
		System.out.println(ss3 == ss5);//false
		System.out.println(ss3.intern() == ss3);//false
		System.out.println(ss3.intern() == ss4);//true
		System.out.println(ss5.intern() == ss5);//true
//		intern的时候创建了一个新的对象。但是不是每次都新建一个，只要有了，就会返回存在的。
//		GC是不会收集Literal Pool的。但是会收集没有intern的String 变量对象。对上面的例子，s3会被回收，s4就不会
		System.out.println("-----4--------------------------------------------------");

		String hello = "Hello", lo = "lo";
		System.out.print((Other1.hello == hello) + " "); // line 1 true
		System.out.print((Other1.hello == "Hello") + " "); // line 2 true
		System.out.print((hello == ("Hel" + "lo")) + " "); // line 3 true
		System.out.print((hello == ("Hel" + lo)) + " "); // line 4 false
		System.out.println(hello == ("Hel" + lo).intern()); // line 5 true
		System.out.println(("Hel" + lo).hashCode()); // hashcode is 69609650 (machine depedent)
		System.out.println("Hello".hashCode()); // hashcode is same WHY ??.

	}

}

class Other1 {
	static String hello = "Hello";
}