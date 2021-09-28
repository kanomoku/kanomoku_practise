package jvm;

public class Jvm4_Xss {
	private static int count;

	private static void recursion() {
		count++;
		recursion();
	}

//	-Xmx20m -Xms20m -XX:NewRatio=4 -XX:SurvivorRatio=8 -Xss2m -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
	public static void main(String[] args) {
		try {
			recursion();
		} catch (Throwable e) {
			System.out.println("调用最大深度：" + count);
			e.printStackTrace();
		}
	}
}
