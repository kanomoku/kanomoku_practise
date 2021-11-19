package exception.trycatchfinally;

import org.junit.Test;

public class TryCatchFinally {
    public static void main(String[] args) {

    }

    @Test
    public void testNormal() {
        TryCatchFinally test = new TryCatchFinally();
        String res = test.testTryCatchFinally();
        System.out.println(res);

    }

    @Test
    public void testCatch() {
        TryCatchFinally test = new TryCatchFinally();
        String res = test.testTryCatchFinally2();
        System.out.println(res);

    }

    public String testTryCatchFinally() {
        try {
            System.out.println("try开始执行");
            System.out.println("try执行完了");
            return "try中的返回值";
        } catch (Exception e) {
            System.out.println("捕获到的异常");
        } finally {
            System.out.println("finally执行完了");
        }
        return "最终中的返回值";
    }

    public String testTryCatchFinally2() {
        try {
            System.out.println("try开始执行");
            String str = null;
            str.length();
            System.out.println("try执行完了");
            return "try中的返回值";
        } catch (Exception e) {
            System.out.println("捕获到的异常");
        } finally {
            System.out.println("finally执行完了");
        }
        return "最终中的返回值";
    }
}