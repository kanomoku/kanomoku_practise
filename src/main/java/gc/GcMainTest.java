package gc;

public class GcMainTest {
	public static void main(String[] args) {
		Person p = new Person();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p = null;

		// 我只是告诉他去回收 至于是不是立刻回收就说的不算了
		System.gc();
//		Runtime.getRuntime().gc();
		// 以上二者等价

		// 不执行gc回收 一直很显示 ： person被创建了
		// 执行GC回收的 几乎立刻显示：person被创建了 person对象被回收了
	}
}
