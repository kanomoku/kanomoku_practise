package jvm;

import java.util.HashMap;
import java.util.Map;

public class Jvm6_PretenureSizeThreshold {
	public static void main(String[] args) {
		// -Xmx30m -Xms30m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000
		//这里不会分配到老年代，原因是，虚拟机面对体量不大的对象，会优先分配到TLAB区域中，因此失去了分配到老年代的机会
		// -Xmx30m -Xms30m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:PretenureSizeThreshold=1000 -XX:-UseTLAB

		Map<Integer, byte[]> m = new HashMap<Integer, byte[]>();
		for (int i = 0; i < 5 * 1024; i++) {
			byte[] b = new byte[1024];
			m.put(i, b);
		}
	}
}
