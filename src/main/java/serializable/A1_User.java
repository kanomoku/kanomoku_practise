package serializable;

import java.io.Serializable;

public class A1_User implements Serializable {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
