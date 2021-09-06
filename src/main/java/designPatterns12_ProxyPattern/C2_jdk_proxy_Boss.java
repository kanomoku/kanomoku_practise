package designPatterns12_ProxyPattern;

public class C2_jdk_proxy_Boss implements C1_jdk_proxy_Function {
	public C2_jdk_proxy_Boss(String name) {
		this.name = name;
	}

	public C2_jdk_proxy_Boss() {
	}

	private String name;

	public void target() {
		System.out.println("制定一个小目标");
	}

	@Override
	public void eat(String str) {
		System.out.println("老板吃" + str);
	}

}
