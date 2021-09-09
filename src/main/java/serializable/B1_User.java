package serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class B1_User implements Externalizable {

	private String name;
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
	}

	@Override
	public String toString() {
		return "B1_User [name=" + name + ", age=" + age + "]";
	}
}
