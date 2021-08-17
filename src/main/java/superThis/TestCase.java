package superThis;

import org.junit.Test;

public class TestCase {
	@Test
	public void test1() {
		SuperPerson p = new SuperPerson();
	}

	@Test
	public void test2() {
		SuperPerson p1 = new SuperPerson("aa");

	}

	@Test
	public void test3() {
		Person p2 = new Person();
        System.out.println("name :" + p2.name);
        System.out.println("-------------");
		p2.eat();
	}

	@Test
	public void test4() {
		SuperPerson p3 = new SuperPerson("aa");
        System.out.println("name :" + p3.name);
        System.out.println("-------------");
		p3.eat();

	}
}
