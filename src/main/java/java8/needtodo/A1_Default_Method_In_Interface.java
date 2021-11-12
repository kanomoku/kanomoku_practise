package java8.needtodo;

public interface A1_Default_Method_In_Interface {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
