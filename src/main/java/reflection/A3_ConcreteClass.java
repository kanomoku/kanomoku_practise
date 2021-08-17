package reflection;

@Deprecated
public class A3_ConcreteClass extends A2_BaseClass implements A1_BaseInterface {

	public int publicInt;
	private String privateString = "private string";
	protected boolean protectedBoolean;
	Object defaultObject;

	public A3_ConcreteClass(int i) {
		this.publicInt = i;
	}

	@Override
	public void method1() {
		System.out.println("Method1 impl.");
	}

	@Override
	public int method2(String str) {
		System.out.println("Method2 impl.");
		return 0;
	}

	@Override
	public int method4() {
		System.out.println("Method4 overriden.");
		return 0;
	}

	public int method5(int i) {
		System.out.println("Method4 overriden.");
		return 0;
	}

	// inner classes
	public class ConcreteClassPublicClass {
	}

	private class ConcreteClassPrivateClass {
	}

	protected class ConcreteClassProtectedClass {
	}

	class ConcreteClassDefaultClass {
	}

	// member enum
	enum ConcreteClassDefaultEnum {
	}

	public enum ConcreteClassPublicEnum {
	}

	// member interface
	public interface ConcreteClassPublicInterface {
	}
}
