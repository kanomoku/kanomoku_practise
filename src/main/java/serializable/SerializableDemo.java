package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// Initializes The Object
		User user = new User();
		user.setName("xiaoming");
		System.out.println(user);

		// Write Obj to File
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
			oos.writeObject(user);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		// Read Obj from File
		File file = new File("tempFile");
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			User newUser = (User) ois.readObject();
			System.out.println(newUser);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

// OutPut:
// User{name='cosen'}
// User{name='cosen'}
