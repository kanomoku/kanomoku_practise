package InnerClass;

public class C2_MyDemo {
	public void test(C1_Demo demo) {
		System.out.println("test method");
	}

	public static void main(String[] args) {
		C2_MyDemo md = new C2_MyDemo();
		// 这里我们使用匿名内部类的方式将接口对象作为参数传递到test方法中去了
		md.test(new C1_Demo() {
			public void demoMethod() {
				System.out.println("具体实现接口");
			}
		});
	}
}