package designPatterns5_SingletonPattern;

import java.io.Serializable;

//Sometimes in distributed systems,
//we need to implement Serializable interface in Singleton class 
//so that we can store its state in the file system and retrieve it at a later point of time

//The problem with serialized singleton class is that 
//whenever we deserialize it, it will create a new instance of the class
public class A8_SerializedSingletonReadResolve implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private A8_SerializedSingletonReadResolve() {
	}

	private static class SingletonHelper {
		private static final A8_SerializedSingletonReadResolve instance = new A8_SerializedSingletonReadResolve();
	}

	public static A8_SerializedSingletonReadResolve getInstance() {
		return SingletonHelper.instance;
	}

	protected Object readResolve() {
	    return getInstance();
	}
}
