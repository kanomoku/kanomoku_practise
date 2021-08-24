package jvm;

public class JvmPractise2_ratio {
	public static void main(String[] args) {
		// -Xmx20m -Xms20m -XX:NewSize=10m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags	
		// -Xmx20m -Xms20m -Xmn10m -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags
		// -Xmx20m -Xms20m -XX:NewRatio=2 -XX:SurvivorRatio=2 -XX:+PrintGCDetails -XX:+UseSerialGC -XX:+PrintCommandLineFlags

		byte[] b = null;
		for (int i = 0; i < 10; i++) {
			b = new byte[1 * 1024 * 1024];
		}
	}
}
