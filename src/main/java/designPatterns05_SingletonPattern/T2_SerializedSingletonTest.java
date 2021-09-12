package designPatterns05_SingletonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.jupiter.api.Test;

public class T2_SerializedSingletonTest {

	@Test
	public void test1() throws FileNotFoundException, IOException, ClassNotFoundException {
		A7_SerializedSingleton instanceOne = A7_SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		A7_SerializedSingleton instanceTwo = (A7_SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
		System.out.println("---------------------------------------");
	}
	@Test
	public void test2() throws FileNotFoundException, IOException, ClassNotFoundException {
		A8_SerializedSingletonReadResolve instanceOne = A8_SerializedSingletonReadResolve.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		A8_SerializedSingletonReadResolve instanceTwo = (A8_SerializedSingletonReadResolve) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
		System.out.println("---------------------------------------");
	}
}
