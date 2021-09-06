package designPatterns5_SingletonPattern;

public class A2_StaticBlockInitializationSingleton {

	private static A2_StaticBlockInitializationSingleton instance;

	private A2_StaticBlockInitializationSingleton() {
	}

	// Static block initialization implementation is similar to eager initialization, 
	//except that instance of class is created in the static block that provides
	// option for exception handling.
	static {
		try {
			instance = new A2_StaticBlockInitializationSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static A2_StaticBlockInitializationSingleton getInstance() {
		return instance;
	}
}