package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class GouZaoFangFa1111111111111 {
	public static void main(String[] args) {

		List<Student> arrayList = new ArrayList<>();
		arrayList.add(new Student("A", 100));
		arrayList.add(new Student("B", 95));
		arrayList.add(new Student("C", 66));
		arrayList.add(new Student("D", 88));

		TreeSet<Student> affectedWsSet = new TreeSet<>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return (int) (o1.getScore() - o2.getScore());
			}
		});
		affectedWsSet.addAll(arrayList);
		System.out.println(affectedWsSet);
		System.out.println("----------------------------------------------");

		// TreeSet 转 List
		List<Student> list2 = new ArrayList<Student>(affectedWsSet);
		System.out.println(list2);
		System.out.println("----------------------------------------------");
		// 新包装一个list
		List<Student> list1 = new ArrayList<Student>(arrayList);
		System.out.println(list1);
		System.out.println("----------------------------------------------");

	}
}

class Student {
	private String name;
	private int score;

	public Student() {
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int a) {
		score = a;
	}

	public String toString() {
		return "[ 姓名是 " + name + " 年龄是 " + score + " ] ";
	}
}