package InnerClass2;

import InnerClass.B1_StaticNestedClass;

public class B3_StaticNestedClassTestProtected extends B1_StaticNestedClass {


	public static void main(String[] args) {

		B1_StaticNestedClass.StaticInerCls nestedObject = new B1_StaticNestedClass.StaticInerCls();

		System.out.println(nestedObject.getName());
	}
}
