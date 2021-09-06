package designPatterns5_SingletonPattern;

//This is the most widely used approach for Singleton class as it doesn’t require synchronization.
public class A5_BillPughSingleton {

	private A5_BillPughSingleton() {
	}

	//When the singleton class is loaded, 
	//SingletonHelper class is not loaded into memory and only when someone calls the getInstance method, 
	//this class gets loaded and creates the Singleton class instance.
	private static class SingletonHelper {
		private static final A5_BillPughSingleton INSTANCE = new A5_BillPughSingleton();
	}

	public static A5_BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
