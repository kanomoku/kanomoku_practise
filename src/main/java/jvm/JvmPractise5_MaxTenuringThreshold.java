package jvm;

import java.util.HashMap;
import java.util.Map;

public class JvmPractise5_MaxTenuringThreshold {
	public static void main(String[] args) {
		// 初始对象在eden区
		// -Xmx64m -Xms64m -XX:+PrintGCDetails -XX:+PrintCommandLineFlags
//		for (int i = 0; i < 5; i++) {
//			byte[] b = new byte[1 * 1024 * 1024];
//		}
		
		//测试进入老年代的对象
		// -Xmx1024m -Xms1024m -XX:+UseSerialGC -XX:MaxTenuringThreshold=5 -XX:+PrintGCDetails -XX:+PrintCommandLineFlags
		Map<Integer,byte[]> m = new HashMap<Integer,byte[]>();
		for (int i = 0; i < 5; i++) {
			byte[] b = new byte[1*1024*1024];
			m.put(i, b);
		}
		Map<Integer,byte[]> m1 = new HashMap<Integer,byte[]>();
		for (int i = 0; i < 10; i++) {
			byte[] b = new byte[1*1024*1024];
			m1.put(i, b);
		}
		for (int i = 0; i < 60; i++) {
			for (int j = 0; j < 80; j++) {
				byte[] b = new byte[1*1024*1024];
			}
		}
	}
}
