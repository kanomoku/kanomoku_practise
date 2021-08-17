package loadClassCreateObject;

public class Uncle {
//	public String name;
	public String name="qq";
	static {
		System.out.println("静态代码块");
	}

	{
		System.out.println("非静态代码块");
		System.out.println(name);
	}

	public Uncle(String name) {
		System.out.println("构造方法1");
		System.out.println(name);

		this.name = name;
		System.out.println("构造方法2");
		System.out.println(name);

	}
}