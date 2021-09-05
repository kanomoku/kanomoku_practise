package exception;

public class UserDefinedException extends  Exception{

	public UserDefinedException() {
    }

    public UserDefinedException(String message) {
        super(message);
    }
}
