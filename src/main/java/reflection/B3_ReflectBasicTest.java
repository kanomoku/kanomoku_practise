package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class B3_ReflectBasicTest {

	@Test
	public void basicTest() throws ClassNotFoundException {
		// 通过一个Class对象来操作Person.class类文件
		try {
			/**
			 * 如何获取Class ----三种方式
			 */
			// 静态方法
			Class clazz = Class.forName("reflection.B2_Person");
			// 类名.class;
			Class c1 = B1_Animal.class;
			// 对象.getClass();//Object类中的方法
			B1_Animal c2 = new B1_Animal();
			Class clazz2 = c2.getClass();

			// 获取包名
			Package p = clazz.getPackage();
			System.out.println("获取包名:" + p.getName());
			System.out.println("------------------------------------------------");

			// 类自己有结构 权限修饰符 特征修饰符 类名字 继承 实现
			int midifiers = clazz.getModifiers();
			System.out.println("修饰符权限：" + midifiers);
			//0 默认不写 1 public 2 private 4 protected 8 static 16 Modifiers 32 synchronized 64 volatile 128 transient 256 native 512 interface 1024 abstract
			
			// 获取类名字
			String name = clazz.getName();
			String simpleName = clazz.getSimpleName();
			System.out.println("获取包名+类名:" + name);
			System.out.println("获取类名:" + simpleName);
			System.out.println("------------------------------------------------");

			// 获取当前class 的父类
			ArrayList<String> list = new ArrayList<String>();
			Class clazz1z = list.getClass();
			while (clazz1z != null) {
				System.out.println("list包名+类名：" + clazz1z.getName());
				clazz1z = clazz1z.getSuperclass();
			}
			System.out.println("------------------------------------------------");

			// 获取接口
			Class clazz1 = list.getClass();
			Class[] classes = clazz1.getInterfaces();
			for (Class c : classes) {
				System.out.println("list包名+实现的接口名：" + c.getName());
			}
			System.out.println("------------------------------------------------");

			/**
			 * 赋值 取值
			 */
			Field f = clazz.getDeclaredField("wife");
			B1_Animal p3 = (B1_Animal) clazz.newInstance();
			// 赋值
			f.setAccessible(true);
			f.set(p3, "张紫涵");
			// 取值
			String value = (String) f.get(p3);
			System.out.println("取出来赋的值：" + value);
			System.out.println("------------------------------------------------");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void costructorTest() throws ClassNotFoundException {
		try {
			// 找到Person对应的class
			Class clazz = B2_Person.class;

			// 构造方法
			Constructor con = clazz.getConstructor();// 获取无参数构造方法
			Constructor con1 = clazz.getConstructor(String.class);// 获取有参数构造方法
			Constructor[] cons = clazz.getConstructors();// 获取所有的构造方法
			Constructor conabstract = clazz.getDeclaredConstructor();
			Constructor conabstract1 = clazz.getDeclaredConstructor(String.class);
			Constructor[] conabstracts = clazz.getDeclaredConstructors();

			// 执行构造方法
			// 相当于调用了B2_Person 类中默认的无参数构造方法创建对象
			B2_Person p = (B2_Person) con.newInstance();
			B2_Person p1 = (B2_Person) con1.newInstance("name");
			System.out.println("con.newInstance()  " + p);
			System.out.println("con1.newInstance(\"name\")  " + p1);
			System.out.println("------------------------------------------------");

			int i = con.getModifiers();
			String name = con.getName();
			Class[] parameterTypes = con.getParameterTypes();
			Class[] exceptionTypes = con.getExceptionTypes();
			System.out.println(i);
			System.out.println(name);
			System.out.println(parameterTypes);
			System.out.println(exceptionTypes);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void fieldTest() throws ClassNotFoundException {
		try {
			Class clazz = B2_Person.class;

			// 属性
			Field[] fields = clazz.getFields();// 可以获取所有公有的属性--包括继承过来的
			for (Field f : fields) {
				System.out.println("公有属性名字：" + f.getName());
			}
			System.out.println("------------------------------------------------");

			Field nameField = clazz.getField("name");// 获取属性：这是知道属性名字--所以很局限
			System.out.println("特定公有属性名字：" + nameField.getName());
			System.out.println("------------------------------------------------");

			// 以上两个方法只能获取公有的属性--但是包含继承过来的父类的属性

			// 如何取得私有的属性呢？
			Field[] declaredFields = clazz.getDeclaredFields();
			for (Field f : declaredFields) {
				System.out.println("私有属性名字：" + f.getName());
			}
			System.out.println("------------------------------------------------");

			Field declaredField = clazz.getDeclaredField("name");
			System.out.println("特定私有属性名字：" + declaredField.getName());
			// 如上的两个方法能获取公有的和私有的属性---但是只能获取本类的属性
			System.out.println("------------------------------------------------");

			int modifiers = nameField.getModifiers();// 获取属性的修饰符
			System.out.println("获取属性的修饰符:" + modifiers);
			Class fclass = nameField.getType();// 获取属性的类型
			System.out.println("获取属性的类型:" + fclass.getName());
			String fname = nameField.getName();// 获取属性的名字
			System.out.println("获取属性的名字:" + fname);
			System.out.println("------------------------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void methodTest() throws ClassNotFoundException {
		try {
			// 获取Reflect_Person_Extends_Animal对应的Class
			Class clazz = B2_Person.class;

			// 获取Class中的方法:通过clazz获取方法--通过方法名字定位方法--通过方法参数类型对应的Class来确定具体的方法
			Method m = clazz.getMethod("eat", String.class);// 获取一个String类型参数的公有方法(自己类+父类)
			Method m1 = clazz.getMethod("eat");// 获取无参数的公有方法(自己类+父类)
			Method[] ms = clazz.getMethods();// 获取所有公有的方法(自己类+父类)
			// 以上方法只能获取公有的方法--但是包含继承过来的父类的方法
			// 如何取得私有方法呢？
			Method m2 = clazz.getDeclaredMethod("drink", String.class);// 获取一个有String类型参数的公有/私有方法(自己类)
			Method m3 = clazz.getDeclaredMethod("drink");// 获取一个无参数的公有/私有方法(自己类)
			Method[] ms4 = clazz.getDeclaredMethods();// 获取全部的公有/私有方法(自己类)
			// 如上的方法能获取公有和私有的方法---但是只能获取本类的方法
			// 获取的方法包含方法的全部信息----包含方法的 权限修饰符 特征修饰符 返回值类型 方法名 参数 异常

			int mm = m.getModifiers();// 获取修饰符--权限--特征
			Class mr = m.getReturnType();// 获取返回值数据类型的
			String mn = m.getName();// 获取方法的名字
			Class[] mpts = m.getParameterTypes();// 获取方法参数列表的类型
			Class[] mets = m.getExceptionTypes();// 获取方法抛出异常的类型
			System.out.println("获取方法修饰符--权限--特征:" + mm);
			System.out.println("获取方法返回值数据类型的:" + mr);
			System.out.println("获取方法的名字:" + mn);
			System.out.println("获取方法参数列表的类型:" + mpts);
			System.out.println("获取方法抛出异常的类型:" + mets);
			System.out.println("------------------------------------------------");

			// 执行方法
			B2_Person person = (B2_Person) clazz.newInstance();
			m1.invoke(person);// 执行无参数方法
			String s = (String) m.invoke(person, "娃哈哈");// 执行有参数的方法
			System.out.println("------------------------------------------------");

//            Method sleep = clazz.getMethod("sleep");//找不到就会抛出异常 IllegalArgumentException
//            m.invoke(person);

			Method testPrivate = clazz.getDeclaredMethod("testPrivate");// 获取一个的方法（权限 + 特征）
			System.out.println(testPrivate.getName());
			testPrivate.setAccessible(true);// 若方法是私有的--不允许操作---可以设置方法的使用权
			testPrivate.invoke(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void changeStringValueTest() throws ClassNotFoundException, NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
		String str = "abc";
		System.out.println(str);

		// 取得类
		Class clazz = str.getClass();
		// 取得属性
		Field field = clazz.getDeclaredField("value");
		// 设置私有属性可以被操作
		field.setAccessible(true);
		// 修改属性
		// 获取属性值 获取value 属性里面的值(内存地址)
		// private final char[] value = { 'a','b','c'}
		char[] temp = (char[]) field.get(str);
		// 通过temp的地址引用 找到真实String对象中的数组 修改数字内的每一个元素
		temp[0] = '麻';
		temp[1] = '诗';
		temp[2] = '民';
		System.out.println(str);
	}
}
