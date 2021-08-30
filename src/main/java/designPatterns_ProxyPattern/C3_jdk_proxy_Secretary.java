package designPatterns_ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class C3_jdk_proxy_Secretary implements InvocationHandler {

	private C2_jdk_proxy_Boss boss = new C2_jdk_proxy_Boss("云云");
	@Override
	//(生成的代理对象,方法,参数)
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("预约时间");
		Object invoke = method.invoke(boss, args);
		System.out.println("记录访客信息");
		return invoke;
	}

}
