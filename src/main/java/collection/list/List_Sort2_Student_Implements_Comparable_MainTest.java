package collection.list;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Slf4j
public class List_Sort2_Student_Implements_Comparable_MainTest {
    public static void main(String[] args) {
        List<Student_Implements_Comparable> comparableList = new ArrayList<>();
        comparableList.add(new Student_Implements_Comparable(23, 90, "张三"));
        comparableList.add(new Student_Implements_Comparable(22, 97, "李四"));
        comparableList.add(new Student_Implements_Comparable(23, 95, "王五"));
        comparableList.add(new Student_Implements_Comparable(24, 91, "赵六"));
        comparableList.add(new Student_Implements_Comparable(21, 98, "赵六"));
        comparableList.add(new Student_Implements_Comparable(21, 98, "赵五"));
        comparableList.add(new Student_Implements_Comparable(21, 99, "赵七"));
        System.out.println("排序之前的list：");
        comparableList.stream().forEach(System.out::println);
        System.out.println("------------------------------------");

        Collections.sort(comparableList);// 升序
        comparableList.stream().forEach(System.out::println);
        Collections.reverse(comparableList);// 降序
        comparableList.stream().forEach(System.out::println);

        System.out.println("---------（使用自定义排序之后）------------");
        comparableList.sort(new Comparator<Student_Implements_Comparable>() {
            @Override
            public int compare(Student_Implements_Comparable o1, Student_Implements_Comparable o2) {
                // 先按照年龄排序
                Integer i = o1.getAge().compareTo(o2.getAge());
                if (i == 0) {
                    // 如果年龄相等，则按照分数排序
                    i = o1.getScore().compareTo(o2.getScore());
                    if (i == 0) {
                        // 如果分数相等，则按照姓名排序
                        i = o1.getName().compareTo(o2.getName());
                    }
                }
                return i;
            }
        });
        comparableList.stream().forEach(System.out::println);

        comparableList.sort(Comparator.naturalOrder());
        comparableList.sort(Comparator.reverseOrder());
        comparableList.stream().forEach(System.out::println);

        comparableList.sort((a, b) -> a.compareTo(b));
        comparableList.stream().forEach(System.out::println);

        comparableList.sort(Student_Implements_Comparable::compareTo);
        comparableList.stream().forEach(System.out::println);

        comparableList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);// 升序
        comparableList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);// 降序

        comparableList.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);// 升序
        comparableList.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);// 升序

        comparableList.stream().sorted(Student_Implements_Comparable::compareTo)
            .forEach(System.out::println);// 升序

        comparableList.stream().sorted(new Comparator<Student_Implements_Comparable>() {
            @Override
            public int compare(Student_Implements_Comparable o1, Student_Implements_Comparable o2) {
                // 先按照年龄排序
                Integer i = o2.getAge().compareTo(o1.getAge());
                if (i == 0) {
                    // 如果年龄相等，则按照分数排序
                    i = o1.getScore().compareTo(o2.getScore());
                    if (i == 0) {
                        // 如果分数相等，则按照姓名排序
                        i = o1.getName().compareTo(o2.getName());
                    }
                }
                return i;
            }
        }).forEach(System.out::println);
    }
}

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor
class Student_Implements_Comparable implements Comparable<Student_Implements_Comparable> {
    private Integer score;
    private Integer age;
    private String name;


    @Override
    public int compareTo(Student_Implements_Comparable o) {
        // 先按照年龄排序
        Integer i = this.age.compareTo(o.getAge());
        if (i == 0) {
            // 如果年龄相等，则按照分数排序
            i = this.score.compareTo(o.getScore());
            if (i == 0) {
                // 如果分数相等，则按照姓名排序
                i = this.getName().compareTo(o.getName());
            }
        }
        return i;
    }
}