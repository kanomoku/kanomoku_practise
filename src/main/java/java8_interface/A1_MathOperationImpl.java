package java8_interface;

public class A1_MathOperationImpl implements A1_IMathOperation {
    @Override
    public int add(int a, int b) {
        System.out.println("IMathOperation.class            : " + A1_IMathOperation.class);
        System.out.println("IMathOperation.super.getClass() : " + A1_IMathOperation.super.getClass());

        // 子类中可以直接调用父类接口默认方法
        A1_IMathOperation.super.print();
        // 调用父类静态默认方法
        A1_IMathOperation.version();
        return a + b;
    }

    public static void main(String[] args) {
        A1_IMathOperation iMathOperation = new A1_MathOperationImpl();
        System.out.println(iMathOperation.add(1, 3));

        // A1_IMathOperation.super.print();//报错
        // iMathOperation.super.print();//报错
        // A1_IMathOperation.print();//报错 default方法不能被类直接调用
        iMathOperation.print(); // 对象可以调用default方法
        A1_IMathOperation.version();// 类可以调用static方法
        //iMathOperation.version();//报错 static方法不能被对象调用
    }
}
