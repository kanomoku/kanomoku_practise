package jvm;

public class Jvm1_MaxTotalFreeMemory {
	public static void main(String[] args) {
		//-Xmx20m -Xms5m -XX:+UseSerialGC -XX:+PrintGCDetails -XX:+PrintCommandLineFlags 
		System.out.println("java虚拟机从操纵系统那里挖到的最大的内存   maxMemory : "+Runtime.getRuntime().maxMemory()/1024/1024+"M");
		System.out.println("java虚拟机已经从操作系统那里挖过来的内存   totalMemory : "+Runtime.getRuntime().totalMemory()/1024/1024+"M");
		System.out.println("java虚拟机从操纵系统挖过来还没用上的内存   freeMemory : "+Runtime.getRuntime().freeMemory()/1024/1024+"M");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		byte[] b1 = new byte[3*1024*1024];
		System.out.println("java虚拟机从操纵系统那里挖到的最大的内存   maxMemory "+Runtime.getRuntime().maxMemory()/1024/1024+"M");
		System.out.println("java虚拟机已经从操作系统那里挖过来的内存   totalMemory : "+Runtime.getRuntime().totalMemory()/1024/1024+"M");
		System.out.println("java虚拟机从操纵系统挖过来还没用上的内存   freeMemory : "+Runtime.getRuntime().freeMemory()/1024/1024+"M");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		byte[] b2 = new byte[4*1024*1024];
		System.out.println("java虚拟机从操纵系统那里挖到的最大的内存   maxMemory "+Runtime.getRuntime().maxMemory()/1024/1024+"M");
		System.out.println("java虚拟机已经从操作系统那里挖过来的内存   totalMemory : "+Runtime.getRuntime().totalMemory()/1024/1024+"M");
		System.out.println("java虚拟机从操纵系统挖过来还没用上的内存   freeMemory : "+Runtime.getRuntime().freeMemory()/1024/1024+"M");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
//		int a = 0x00000000fec00000;
//		int b = 0x00000000fee10000;
//		System.out.println((b-a)/1024);
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

}
