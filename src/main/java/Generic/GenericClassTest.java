package Generic;

public class GenericClassTest {

	public GenericClassTest() {
	}

	public static void main(String[] args) {
		// 创建对象并指定元素类型
		GenericClass<String> tool = new GenericClass<>();

		tool.setObj(new String("哈哈"));
		String s = tool.getObj();
		System.out.println(s);

		// 创建对象并指定元素类型
		GenericClass<Integer> objectTool = new GenericClass<>();
		// 我在这个对象里传入的是String类型的,它在编译时期就通过不了了.
		objectTool.setObj(10);
		int i = objectTool.getObj();
		System.out.println(i);
	}

}
