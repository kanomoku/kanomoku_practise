package javaCharacteristics;

public class TextFileStaticPolymorphism {

	public String read() {
		return "StaticPolymorphism".toString();
	}

	public String read(int limit) {
		return "StaticPolymorphism".substring(0, limit);
	}

	public String read(int start, int stop) {
		return "StaticPolymorphism".substring(start, stop);
	}
}
