package loadClassCreateObject;

public class Father {
	public static String fatherStr = "父静态变量";
    static {
        System.out.println("父静态代码块");
    }

    {
        System.out.println("父非静态代码块");
    }

    public Father(){
        System.out.println("父构造方法");
    }
}