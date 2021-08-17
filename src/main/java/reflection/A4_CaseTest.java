package reflection;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class A4_CaseTest {

	@Test
	public void test1() {

		// Get Class using reflection
		Class<?> concreteClass = A3_ConcreteClass.class;
		concreteClass = new A3_ConcreteClass(5).getClass();
		try {
			// below method is used most of the times in frameworks like
			// JUnit
			// Spring dependency injection,
			// Tomcat web container Eclipse auto completion of method names,
			// hibernate, Struts2 etc.
			// because ConcreteClass is not available at compile time
			concreteClass = Class.forName("reflection.A3_ConcreteClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(concreteClass.getCanonicalName());

		// for primitive types, wrapper classes and arrays
		Class<?> booleanClass = boolean.class;
		System.out.println(booleanClass.getCanonicalName()); // prints boolean

		Class<?> cDouble = Double.TYPE;
		System.out.println(cDouble.getCanonicalName()); // prints double

		try {
			Class<?> cDoubleArray;
			cDoubleArray = Class.forName("[D");
			System.out.println(cDoubleArray.getCanonicalName()); // prints double[]
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Class<?> twoDStringArray = String[][].class;
		System.out.println(twoDStringArray.getCanonicalName()); // prints java.lang.String[][]

	}

	@Test
	public void test2() {
		Class<?> superClass;
		try {
			superClass = Class.forName("reflection.A3_ConcreteClass").getSuperclass();
			System.out.println(superClass); // prints "class com.journaldev.reflection.BaseClass"
			System.out.println(Object.class.getSuperclass()); // prints "null"
			System.out.println(String[][].class.getSuperclass());// prints "class java.lang.Object"
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void test3() throws ClassNotFoundException {
		Class<?> concreteClass = Class.forName("reflection.A3_ConcreteClass");

		// returns an array containing Class objects representing all the public
		// classes, interfaces and enums that are members of the class represented by
		// this Class object.
		Class<?>[] classes = concreteClass.getClasses();
		System.out.println(Arrays.toString(classes));
	}

	@Test
	public void test4() throws ClassNotFoundException {
		// getting all of the classes, interfaces, and enums that are explicitly
		// declared in A3_ConcreteClass
		Class<?>[] explicitClasses = Class.forName("reflection.A3_ConcreteClass").getDeclaredClasses();
		System.out.println(Arrays.toString(explicitClasses));

		Class<?> innerClass = Class.forName("reflection.A3_ConcreteClass$ConcreteClassDefaultClass");
		System.out.println(innerClass.getDeclaringClass().getCanonicalName());
		System.out.println(innerClass.getEnclosingClass().getCanonicalName());
	}

	@Test
	public void test5() throws ClassNotFoundException {
		Class<?> concreteClass = Class.forName("reflection.A3_ConcreteClass");

		System.out.println(concreteClass.getPackage().getName());
		System.out.println(Modifier.toString(concreteClass.getModifiers()));
		System.out.println(Modifier.toString(Class.forName("reflection.A1_BaseInterface").getModifiers()));

	}

	@Test
	public void test6() throws ClassNotFoundException {
		// Get Type parameters (generics)
		TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
		for (TypeVariable<?> t : typeParameters)
			System.out.print(t.getName() + ",");
	}

	@Test
	public void test7() throws ClassNotFoundException {

		Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
		//prints "[java.util.Map<K, V>, interface java.lang.Cloneable, interface java.io.Serializable]"
		System.out.println(Arrays.toString(interfaces));
		//prints "[interface java.util.Map, interface java.lang.Cloneable, interface java.io.Serializable]"
		System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));
		// Get Type parameters (generics)
		TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
		for (TypeVariable<?> t : typeParameters)
			System.out.print(t.getName() + ",");
	}
}
