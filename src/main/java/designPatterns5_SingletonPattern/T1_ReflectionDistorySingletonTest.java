package designPatterns5_SingletonPattern;

import java.lang.reflect.Constructor;

import org.junit.jupiter.api.Test;

public class T1_ReflectionDistorySingletonTest {

	@Test
	public void test1() {
		System.out.println("---1------------------------------------");
		A1_EagerInitializedSingleton instanceOne = A1_EagerInitializedSingleton.getInstance();
		A1_EagerInitializedSingleton instanceTwo = null;
		try {
			Constructor[] constructors = A1_EagerInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (A1_EagerInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		System.out.println("---1------------------------------------");
	}

	@Test
	public void test2() {
		System.out.println("---2------------------------------------");
		A2_StaticBlockInitializationSingleton instanceOne = A2_StaticBlockInitializationSingleton.getInstance();
		A2_StaticBlockInitializationSingleton instanceTwo = null;
		try {
			Constructor[] constructors = A2_StaticBlockInitializationSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (A2_StaticBlockInitializationSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		System.out.println("----2-----------------------------------");
	}

	@Test
	public void test3() {
		System.out.println("----3-----------------------------------");
		A3_LazyInitializedSingleton instanceOne = A3_LazyInitializedSingleton.getInstance();
		A3_LazyInitializedSingleton instanceTwo = null;
		try {
			Constructor[] constructors = A3_LazyInitializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (A3_LazyInitializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		System.out.println("----3-----------------------------------");
	}

	@Test
	public void test4() {
		System.out.println("----4-----------------------------------");
		A4_LazyInitializedSingletonThreadSafe instanceOne = A4_LazyInitializedSingletonThreadSafe.getInstance();
		A4_LazyInitializedSingletonThreadSafe instanceTwo = null;
		try {
			Constructor[] constructors = A4_LazyInitializedSingletonThreadSafe.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (A4_LazyInitializedSingletonThreadSafe) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		System.out.println("----4-----------------------------------");
	}

	@Test
	public void test5() {
		System.out.println("------5---------------------------------");
		A5_BillPughSingleton instanceOne = A5_BillPughSingleton.getInstance();
		A5_BillPughSingleton instanceTwo = null;
		try {
			Constructor[] constructors = A5_BillPughSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (A5_BillPughSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		System.out.println("------5---------------------------------");
	}

	@Test
	public void test6() {
		System.out.println("------6---------------------------------");
		A6_EnumSingleton instanceOne = A6_EnumSingleton.INSTANCE;
		System.out.println(instanceOne.hashCode());

		A6_EnumSingleton instanceTwo = null;
		try {
			Constructor[] constructors = A6_EnumSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (A6_EnumSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceTwo.hashCode());
		System.out.println("----6-----------------------------------");

	}
	@Test
	public void test7() {
		System.out.println("-----7----------------------------------");
		A7_SerializedSingleton instanceOne = A7_SerializedSingleton.getInstance();
		A7_SerializedSingleton instanceTwo = null;
		try {
			Constructor[] constructors = A7_SerializedSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (A7_SerializedSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
		System.out.println("-----7----------------------------------");

	}
	
	@Test
	public void test8() {
		System.out.println("-----8----------------------------------");
		A8_SerializedSingletonReadResolve instanceOne = A8_SerializedSingletonReadResolve.getInstance();
//		System.out.println(instanceOne.hashCode());
		
		A8_SerializedSingletonReadResolve instanceTwo = null;
		try {
			Constructor[] constructors = A8_SerializedSingletonReadResolve.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instanceTwo = (A8_SerializedSingletonReadResolve) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceTwo.hashCode());
		System.out.println("-----8----------------------------------");

	}
}
