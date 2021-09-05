package exception;

public class UserDefinedExceptionTest {

    public static void main(String[] args) {
        UserDefinedExceptionTest test = new UserDefinedExceptionTest();
        try {
            test.testMyException();
        } catch (UserDefinedException e) {
            e.printStackTrace();
        }
    }

    //设计一个方法测试自定义异常
    public void testMyException() throws UserDefinedException {
        if (3 > 2) {//若满足某个条件
            throw new UserDefinedException("说明一下异常的具体问题");
        }
    }
}
