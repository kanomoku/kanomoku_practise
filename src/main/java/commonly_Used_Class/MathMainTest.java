package commonly_Used_Class;


import java.math.BigInteger;

public class MathMainTest {
    public static void main(String[] args) {
        MathMainTest testMath = new MathMainTest();
        BigInteger bigInteger1 = testMath.factorial_SuanJieCheng(3);
        System.out.println(bigInteger1);
    }


    /**
     * 设计一个方法  用来计算给定数字的阶乘
     * 参数 返回值
     *
     * @param num
     * @return
     */
    public BigInteger factorial_SuanJieCheng(int num) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(i + ""));
        }
        return bigInteger;
    }


}
