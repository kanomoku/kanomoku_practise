package java8.needtodo;

public class A1_Default_Method_In_Interface_MainTest {
    public static void main(String[] args) {

        A1_Default_Method_In_Interface formula = new A1_Default_Method_In_Interface() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(100)); // 100.0
        System.out.println(formula.sqrt(16)); // 4.0
    }
}
