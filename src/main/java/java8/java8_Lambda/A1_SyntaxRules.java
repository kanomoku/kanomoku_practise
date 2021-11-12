package java8.java8_Lambda;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import org.junit.Test;

public class A1_SyntaxRules {

    public static void main(String[] args) {}

    @Test
    /*
     * 语法格式一：Lambda表达式的参数列表的数据类型 和 返回值类型 可以省略不写，因为JVM编译器通过上下文推断出数据类型
     * 语法格式二：若只有一个参数，小括号可以省略不写
     * 语法格式三：若 Lambda 体中只有一条语句，return 和 大括号都可以省略不写
     */
    public void test0() {
        // 语法格式二：若只有一个参数，小括号可以省略不写
        Consumer<String> stringConsumer11 = a -> System.out.print(a);
        stringConsumer11.accept("456");

        // 语法格式三：若 Lambda 体中只有一条语句，return 和 大括号都可以省略不写
        BinaryOperator<Long> operators1 = (a2, b2) -> a2 + b2;
        Long a2 = operators1.apply(1L, 2L);
        System.out.println(a2);// 3
    }

    @Test
    /*
     * 语法格式四：无参数，无返回值
     */
    public void test1() {
        // jdk1.8以前
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8, too much code for too little to do");
            }
        }).start();

        // 语法格式四：无参数，无返回值
        new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();
    }

    @Test
    /*
     * 语法格式五：有参数，无返回值
     */
    public void test2() {
        // jdk1.8以前
        Consumer<String> stringConsumer1 = new Consumer<String>() {
            @Override
            public void accept(String ss) {
                System.out.print(ss);
            }
        };
        stringConsumer1.accept("123");

        // 语法格式五：有参数，无返回值
        Consumer<String> stringConsumer = (a) -> System.out.print(a);
        stringConsumer.accept("123");

    }

    @Test
    /*
     * 语法格式六：有参数，有返回值
     */
    public void test3() {
        // jdk1.8以前
        BinaryOperator<Long> operator = new BinaryOperator<Long>() {
            @Override
            public Long apply(Long a, Long b) {
                return a + b;
            }
        };
        Long a1 = operator.apply(1L, 2L);
        System.out.println(a1);// 3

        // 语法格式六：有参数，有返回值
        BinaryOperator<Long> operators = (a, b) -> {
            return a + b;
        };
        Long a = operators.apply(1L, 2L);
        System.out.println(a);// 3

    }

}
