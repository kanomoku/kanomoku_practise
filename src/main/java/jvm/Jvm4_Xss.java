package jvm;

public class Jvm4_Xss {
	private static int count;

	private static void recursion() {
		count++;
		recursion();
	}

	public static void main(String[] args) {
		// -Xss1m
		// -Xss4m
		try {
			recursion();
		} catch (Throwable e) {
			System.out.println("调用最大深度：" + count);
			e.printStackTrace();
		}

	}
}
