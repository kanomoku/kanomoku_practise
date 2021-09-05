package exception;

public class A2_ThrowsException {
	public static void main(String[] args) {
		A2_ThrowsException test = new A2_ThrowsException();
		test.testthrowsException();
	}

	public String testthrowsException() throws NullPointerException, StringIndexOutOfBoundsException {
		String str = null;
		int a = 5;

		if (a > 5) {
			str = "abc";
		}
		
		if (str == null) {
			throw new NullPointerException(); // 抛出异常
		} else {
			str.length();
			return str;
		}
	}
}