package designPatterns5_SingletonPattern;

public class A4_LazyInitializedSingletonThreadSafe {

	private static A4_LazyInitializedSingletonThreadSafe instance;

	private A4_LazyInitializedSingletonThreadSafe() {
	}

	public static synchronized A4_LazyInitializedSingletonThreadSafe getInstance() {
		if (instance == null) {
			instance = new A4_LazyInitializedSingletonThreadSafe();
		}
		return instance;
	}
	
	//To avoid this extra overhead every time, double checked locking principle is used
	public static A4_LazyInitializedSingletonThreadSafe getInstanceUsingDoubleLocking(){
	    if(instance == null){
	        synchronized (A4_LazyInitializedSingletonThreadSafe.class) {
	            if(instance == null){
	                instance = new A4_LazyInitializedSingletonThreadSafe();
	            }
	        }
	    }
	    return instance;
	}
}
