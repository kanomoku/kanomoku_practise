package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class B2_ExternalizableDemo {

	public static void main(String[] args) {
		// Write Obj to file
		B1_User user = new B1_User();
		user.setName("LingLing");
		user.setAge(18);
		System.out.println(user);
		
		try {
			new ObjectOutputStream(new FileOutputStream("tempFile")).writeObject(user);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Read Obj from file
		File file = new File("tempFile");
		try {
			B1_User newInstance = (B1_User) new ObjectInputStream(new FileInputStream(file)).readObject();
			System.out.println(newInstance);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

