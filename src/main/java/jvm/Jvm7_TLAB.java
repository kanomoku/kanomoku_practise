package jvm;

public class Jvm7_TLAB {
	private static void alloc() {
		byte[] b = new byte[2];
	}
	public static void main(String[] args) {
		
//		-XX:+UseTLAB -XX:+PrintTLAB -XX:+PrintGC -XX:+TLABSize=102400 -XX:-ResizeTLAB -XX:TLABRefillWasteFraction=100 -XX:-DoEscapeAnalysis -server
		for (int i = 0; i < 10000000; i++) {
			alloc();
		}
	}
}
