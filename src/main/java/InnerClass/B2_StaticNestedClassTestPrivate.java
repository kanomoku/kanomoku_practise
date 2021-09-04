package InnerClass;

public class B2_StaticNestedClassTestPrivate {

	public B2_StaticNestedClassTestPrivate() {
	}

	public static void main(String[] args) {

		B1_StaticNestedClass.StaticInerCls nestedObject = new B1_StaticNestedClass.StaticInerCls();

		System.out.println(nestedObject.getName());
	}
}
