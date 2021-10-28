package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Sort2_Student_Implements_Comparable_MainTest {
	public static void main(String[] args) {
		List<Student_Implements_Comparable> studentImplementsComparableList = new ArrayList<>();
		studentImplementsComparableList.add(new Student_Implements_Comparable(23, 90, "张三"));
		studentImplementsComparableList.add(new Student_Implements_Comparable(22, 97, "李四"));
		studentImplementsComparableList.add(new Student_Implements_Comparable(23, 95, "王五"));
		studentImplementsComparableList.add(new Student_Implements_Comparable(24, 91, "赵六"));
		studentImplementsComparableList.add(new Student_Implements_Comparable(21, 98, "赵六"));
		studentImplementsComparableList.add(new Student_Implements_Comparable(21, 98, "赵五"));
		studentImplementsComparableList.add(new Student_Implements_Comparable(21, 99, "赵七"));
		System.out.println("排序之前的list：");
		studentImplementsComparableList.stream().forEach(System.out::println);
		System.out.println("------------------------------------");

		Collections.sort(studentImplementsComparableList);// 升序
		studentImplementsComparableList.stream().forEach(System.out::println);
//		Collections.reverse(studentImplementsComparableList);// 降序
//		studentImplementsComparableList.stream().forEach(System.out::println);

		
//		System.out.println("---------（使用自定义排序之后）------------");
//		studentImplementsComparableList.sort(new Comparator<Student_Implements_Comparable>() {
//			@Override
//			public int compare(Student_Implements_Comparable o1, Student_Implements_Comparable o2) {
//				// 先按照年龄排序
//				Integer i = o1.getAge().compareTo(o2.getAge());
//				if (i == 0) {
//					// 如果年龄相等，则按照分数排序
//					i = o1.getScore().compareTo(o2.getScore());
//					if (i == 0) {
//						// 如果分数相等，则按照姓名排序
//						i = o1.getName().compareTo(o2.getName());
//					}
//				}
//				return i;
//			}
//		});
//		studentImplementsComparableList.stream().forEach(System.out::println);
		
//		studentImplementsComparableList.sort(Comparator.naturalOrder());
//		studentImplementsComparableList.sort(Comparator.reverseOrder());
//		studentImplementsComparableList.stream().forEach(System.out::println);
		
//		studentImplementsComparableList.sort((a, b) -> a.compareTo(b));
//		studentImplementsComparableList.stream().forEach(System.out::println);
		
//		studentImplementsComparableList.sort(Student_Implements_Comparable::compareTo);
//		studentImplementsComparableList.stream().forEach(System.out::println);
//
//		studentImplementsComparableList.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);// 升序
//		studentImplementsComparableList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);// 降序

//		studentImplementsComparableList.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);// 升序
//		studentImplementsComparableList.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);// 升序

//		studentImplementsComparableList.stream().sorted(Student_Implements_Comparable::compareTo).forEach(System.out::println);// 升序
		
//		studentImplementsComparableList.stream().sorted(new Comparator<Student_Implements_Comparable>() {
//			@Override
//			public int compare(Student_Implements_Comparable o1, Student_Implements_Comparable o2) {
//				// 先按照年龄排序
//				Integer i = o2.getAge().compareTo(o1.getAge());
//				if (i == 0) {
//					// 如果年龄相等，则按照分数排序
//					i = o1.getScore().compareTo(o2.getScore());
//					if (i == 0) {
//						// 如果分数相等，则按照姓名排序
//						i = o1.getName().compareTo(o2.getName());
//					}
//				}
//				return i;
//			}
//		}).forEach(System.out::println);
	}
}

class Student_Implements_Comparable implements Comparable<Student_Implements_Comparable> {
//	class Student_Implements_Comparable {
	private Integer age;
	private Integer score;
	private String name;

	public Student_Implements_Comparable() {
	}

	public Student_Implements_Comparable(Integer age, Integer score, String name) {
		this.age = age;
		this.score = score;
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	@Override
	public String toString() {
		return "Student{" + "age=" + age + ", score=" + score + ", name='" + name + '\'' + '}';
	}
}