package designPatterns05_SingletonPattern;

import java.io.Serializable;

//Sometimes in distributed systems,
//we need to implement Serializable interface in Singleton class 
//so that we can store its state in the file system and retrieve it at a later point of time

//The problem with serialized singleton class is that 
//whenever we deserialize it, it will create a new instance of the class
public class A7_SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -7604766932017737115L;

	private A7_SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final A7_SerializedSingleton instance = new A7_SerializedSingleton();
	}

	public static A7_SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}
}
