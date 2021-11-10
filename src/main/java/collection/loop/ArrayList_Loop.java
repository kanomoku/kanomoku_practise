package collection.loop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**
 * https://blog.csdn.net/yangliangliang2011/article/details/88640653
 */
public class ArrayList_Loop {
    public static void main(String[] args) {
        List<Integer> list = fillNumber();
        foriTest(list);
        forBoostTest(list);
        forIteratorTest(list);
        whileIteratorTest(list);
        forEachTest(list);
        streamForEachTest(list);
        parallelStreamForEachTest(list);

    }

    private static List<Integer> fillNumber() {
        List<Integer> list = new ArrayList<>();
        int n = 10000000;
        while (n > 0) {
            list.add(n);
            n--;
        }
        return list;
    }

    /**
     * fori循环
     *
     * 效率最高 也是java官方推荐的用法
     */
    @Test()
    public static void foriTest(List<Integer> list) {
        long before = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            Integer a = list.get(i);
        }
        long after = System.currentTimeMillis();
        System.out.println("for i time=\t" + (after - before));
    }

    /**
     * 增强for循环
     */
    @Test()
    public static void forBoostTest(List<Integer> list) {
        long before = System.currentTimeMillis();
        for (int i : list) {
            Integer a = i;
        }
        long after = System.currentTimeMillis();
        System.out.println("for Boost time=\t" + (after - before));
    }

    /**
     * iterator迭代器
     */
    @Test()
    public static void forIteratorTest(List<Integer> list) {
        long before = System.currentTimeMillis();
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer a = (Integer)iterator.next();
        }
        long after = System.currentTimeMillis();
        System.out.println("iterator for time=\t" + (after - before));
    }
    /**
     * iterator迭代器
     */
    @Test()
    public static void whileIteratorTest(List<Integer> list) {
        long before = System.currentTimeMillis();
        // while 循环写法
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer a = (Integer)iterator.next();
        }
        long after = System.currentTimeMillis();
        System.out.println("iterator while time=\t" + (after - before));
    }

    /**
     * lambda
     *
     * 最慢 不推荐
     */
    @Test()
    public static void forEachTest(List<Integer> list) {
        long before = System.currentTimeMillis();
        list.forEach(item -> {
            Integer a = item;
        });
        long after = System.currentTimeMillis();
        System.out.println("lambda time=\t" + (after - before));
    }

    /**
     * stream foreach
     *
     * java8特有
     */
    @Test()
    public static void streamForEachTest(List<Integer> list) {
        long before = System.currentTimeMillis();
        list.stream().forEach(item -> {
            Integer a = item;
        });
        long after = System.currentTimeMillis();
        System.out.println("list.stream().forEach time=\t" + (after - before));
    }

    /**
     * parallelStream foreach
     *
     * java8特有
     */
    //
    @Test()
    public static void parallelStreamForEachTest(List<Integer> list) {
        long before = System.currentTimeMillis();
        list.parallelStream().forEach(item -> {
            Integer a = item;
        });
        long after = System.currentTimeMillis();
        System.out.println("list.parallelStream().forEach time=\t" + (after - before));
    }
}
