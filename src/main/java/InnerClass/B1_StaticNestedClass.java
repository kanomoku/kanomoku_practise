package InnerClass;

public class B1_StaticNestedClass {
	private String name;

	protected static class StaticInerCls {
		private String name = "yes";

		public StaticInerCls() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	public static void main(String[] args) {

		B1_StaticNestedClass.StaticInerCls nestedObject = new B1_StaticNestedClass.StaticInerCls();

		System.out.println(nestedObject.getName());
	}
}
