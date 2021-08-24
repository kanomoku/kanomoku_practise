package jvm;

public class Jvm3_AssignNewGenerationSize {
	public static void main(String[] args) {

		// -Xmn   -XX:NewSize   -XX:MaxNewSize  -XX:NewRatio
		byte[] b = null;
		for (int i = 0; i < 10; i++) {
			b = new byte[1 * 1024 * 1024];
		}
	}
}
