package java8_interface;

public interface A1_IMathOperation {

    default void print(){
        System.out.println("这是数值运算默认方法...");
    }

    static void version(){
        System.out.println("这是1.0版简易计算器");
    }

    public int add(int a,int b);
}