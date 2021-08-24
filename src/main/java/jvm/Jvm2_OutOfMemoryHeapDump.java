package jvm;

public class Jvm2_OutOfMemoryHeapDump {
	public static void main(String[] args) {
		// -Xmx2m -Xms2m -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath = d:/outofmemory.dump

		byte[] b = null;
		for (int i = 0; i < 10; i++) {
			b = new byte[1 * 1024 * 1024];
		}
	}
}
