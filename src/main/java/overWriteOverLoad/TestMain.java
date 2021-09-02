package overWriteOverLoad;

import org.junit.Test;

//为什么重写方法以后子类返回值要小于等于父类？
public class TestMain {

	@Test
	public void test1() {
		B b = new B();
//		System.out.println(b.name);
		A a = new A();
//		System.out.println(a.name);

		a = b.getInstance();// 父类引用指向子类实例,b
		System.out.println(a.name);
		a = a.getInstance();// 父类对象引用来调用子类重写的方法.b
		System.out.println(a.name);
	}

	@Test
	public void test2() {
		B b = new B();
		System.out.println(b.name);
		A a = new A();
		System.out.println(a.name);
		
		A a2 = a;
		
		a = b.getInstance();
		System.out.println(a.name);//b
		
		a = a.getInstance();
		System.out.println(a.name);//b
		
		a2 = a2.getInstance();
		System.out.println(a2.name);//a
	}
}
