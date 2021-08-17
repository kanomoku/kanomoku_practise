package loadClassCreateObject;

public class Son extends Father {

    static {
        System.out.println("子静态代码块");
    }
    public static String sonStr = "父静态变量";

    {
        System.out.println("子非静态代码块");
    }

    public Son(){
        System.out.println("子构造方法");
    }

    public static void main(String[] args) {
        new Son();
    }
}