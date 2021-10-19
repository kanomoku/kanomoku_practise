package java8_interface;

public class A1_MathOperationImpl2 implements A1_IMathOperation {
    @Override
    public int add(int a, int b) {
        A1_IMathOperation.version();
        return a + b;
    }

    static void version(){
        System.out.println("实例的静态方法");
    }

    public static void main(String[] args) {
        A1_IMathOperation.version();
        A1_MathOperationImpl2.version();
    }
}
