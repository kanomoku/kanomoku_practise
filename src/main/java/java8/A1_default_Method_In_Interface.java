package java8;

public interface A1_default_Method_In_Interface {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
