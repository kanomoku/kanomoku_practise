package commonly_Used_Class;

public class TimeMainTest {

    public TimeMainTest() {
    }

    public static void main(String[] args) {

        // 1秒=10的3次方毫秒=10的6次方微秒=10的9次方纳秒 
    	// 1  1000       1000000    1000000000
        // java的System.currentTimeMillis()和System.nanoTime()区别:
        //
        // java中System.nanoTime()返回的是纳秒，nanoTime而返回的可能是任意时间，甚至可能是负数……
        // java中System.currentTimeMillis()返回的毫秒，这个毫秒其实就是自1970年1月1日0时起的毫秒数.
        //
        // 两个方法都不能保证完全精确,精确程度依赖具体的环境.
        long startTime = System.nanoTime();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
        }
        long endTime = System.nanoTime();
        long endTime1 = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println(duration + "纳秒");
        long duration1 = endTime1 - startTime1;
        System.out.println(duration1 + "毫秒");
    }
}
