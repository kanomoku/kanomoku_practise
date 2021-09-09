package reflection;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class A4_CaseTest {

	@Test
	public void test1() throws ClassNotFoundException {

		try {
			Class<?> concreteClass = A3_ConcreteClass.class;
			System.out.println(concreteClass.getCanonicalName());
			concreteClass = new A3_ConcreteClass(5).getClass();
			System.out.println(concreteClass.getCanonicalName());
			concreteClass = Class.forName("reflection.A3_ConcreteClass");
			System.out.println(concreteClass.getName());
			System.out.println(concreteClass.getSimpleName());
			System.out.println(concreteClass.getCanonicalName());
			System.out.println("******************");
			// for primitive types, wrapper classes and arrays
			Class<?> obj = Byte.TYPE;
			System.out.println(obj.getCanonicalName());
			obj = Short.TYPE;
			System.out.println(obj.getCanonicalName());
			obj = Integer.TYPE;
			System.out.println(obj.getCanonicalName());
			obj = Long.TYPE;
			System.out.println(obj.getCanonicalName());
			obj = Float.TYPE;
			System.out.println(obj.getCanonicalName());
			obj = Double.TYPE;
			System.out.println(obj.getCanonicalName());
			obj = Boolean.TYPE;
			System.out.println(obj.getCanonicalName());
			obj = boolean.class;
			System.out.println(obj.getCanonicalName());
			obj = Character.TYPE;
			System.out.println(obj.getCanonicalName());

			System.out.println("******************");
			obj = Class.forName("[B");
			System.out.println(obj.getCanonicalName());
			obj = Class.forName("[S");
			System.out.println(obj.getCanonicalName());
			obj = Class.forName("[I");
			System.out.println(obj.getCanonicalName());
			obj = Class.forName("[F");
			System.out.println(obj.getCanonicalName());
			obj = Class.forName("[D");
			System.out.println(obj.getCanonicalName());
			obj = Class.forName("[C");
			System.out.println(obj.getCanonicalName());
			System.out.println("******************");

			obj = Byte[].class;
			System.out.println(obj.getCanonicalName());
			obj = Short[].class;
			System.out.println(obj.getCanonicalName());
			obj = Integer[].class;
			System.out.println(obj.getCanonicalName());
			obj = Long[].class;
			System.out.println(obj.getCanonicalName());
			obj = Float[].class;
			System.out.println(obj.getCanonicalName());
			obj = Double[].class;
			System.out.println(obj.getCanonicalName());
			obj = Boolean[].class;
			System.out.println(obj.getCanonicalName());
			obj = Character[].class;
			System.out.println(obj.getCanonicalName());
			obj = String[].class;
			System.out.println(obj.getCanonicalName());
			System.out.println("******************");

			obj = Byte[][].class;
			System.out.println(obj.getCanonicalName());
			obj = Short[][].class;
			System.out.println(obj.getCanonicalName());
			obj = Integer[][].class;
			System.out.println(obj.getCanonicalName());
			obj = Long[][].class;
			System.out.println(obj.getCanonicalName());
			obj = Float[][].class;
			System.out.println(obj.getCanonicalName());
			obj = Double[][].class;
			System.out.println(obj.getCanonicalName());
			obj = Boolean[][].class;
			System.out.println(obj.getCanonicalName());
			obj = Character[][].class;
			System.out.println(obj.getCanonicalName());
			obj = String[][].class;
			System.out.println(obj.getCanonicalName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
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
	public void testInnerClass() throws ClassNotFoundException {

		Class<?> concreteClass = Class.forName("reflection.A3_ConcreteClass");
		Class<?>[] classes = concreteClass.getClasses();
		System.out.println(Arrays.toString(classes));
		classes = concreteClass.getDeclaredClasses();
		System.out.println(Arrays.toString(classes));

	}

	@Test
	public void test4() throws ClassNotFoundException {
		
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
