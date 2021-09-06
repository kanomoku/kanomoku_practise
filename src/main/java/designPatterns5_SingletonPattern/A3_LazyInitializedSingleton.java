package designPatterns_SingletonPattern;

public class A3_LazyInitializedSingleton {

	private static A3_LazyInitializedSingleton instance;

	private A3_LazyInitializedSingleton() {
	}

	public static A3_LazyInitializedSingleton getInstance() {
		if (instance == null) {
			instance = new A3_LazyInitializedSingleton();
		}
		return instance;
	}
}