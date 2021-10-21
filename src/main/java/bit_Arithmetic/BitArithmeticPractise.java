package bit_Arithmetic;

public class BitArithmeticPractise {
    public static void main(String[] args) {
        // m*2^n
        System.out.println("2^3=" + (1 << 3));// 2^3=8
        System.out.println("3*2^3=" + (3 << 3));// 3*2^3=24
        System.out.println("5*2^3=" + (5 << 3));// 5*2^3=40

        // 判断一个数的奇偶性
        System.out.println((5 & 1) == 1 ? "奇数" : "偶数"); // 奇数
        System.out.println((6 & 1) == 1 ? "奇数" : "偶数"); // 偶数
        System.out.println((0 & 1) == 1 ? "奇数" : "偶数"); // 偶数
        System.out.println((-1 & 1) == 1 ? "奇数" : "偶数"); // 奇数
        System.out.println((-2 & 1) == 1 ? "奇数" : "偶数"); // 偶数

        // 不用临时变量交换两个数
        int x = 5;
        int y = 6;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x);// 6
        System.out.println(y);// 5

        // 取绝对值
        System.out.println((-5 ^ (-5 >> 31)) - (-5 >> 31));// 5
        System.out.println((0 ^ (0 >> 31)) - (0 >> 31));// 0
        System.out.println((5 ^ (5 >> 31)) - (5 >> 31));// 5
        System.out.println((6 ^ (6 >> 31)) - (6 >> 31));// 6
        System.out.println((7 ^ (7 >> 31)) - (7 >> 31));// 7
    }
}
