package Generic;

public class GenericMethodTest {

	public GenericMethodTest() {
	}

	public static void main(String[] args) {
		// 创建对象
		GenericMethod<Object> tool = new GenericMethod<>();

		tool.show("hello");
		tool.show(12);
		tool.show(12.5);
		
		System.out.println(tool.show1("hello"));
		System.out.println(tool.show1(12));
		System.out.println(tool.show1(12.5));
	}

}
