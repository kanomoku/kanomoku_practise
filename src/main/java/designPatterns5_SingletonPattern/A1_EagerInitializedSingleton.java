package designPatterns5_SingletonPattern;

public class A1_EagerInitializedSingleton {

	private static final A1_EagerInitializedSingleton instance = new A1_EagerInitializedSingleton();

	// private constructor to avoid client applications to use constructor
	private A1_EagerInitializedSingleton() {
	}

	public static A1_EagerInitializedSingleton getInstance() {
		return instance;
	}

}
