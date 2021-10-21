package java8_BuiltInFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F1_Comparator {

	public static void main(String[] args) {
		List<Student> studentsList =new ArrayList();
		Student student1 = new Student("zhangsan",60);
		studentsList.add(student1);
		Student student3 = new Student("wangwu",80);
		studentsList.add(student3);
		Student student4 = new Student("zhaoliu",90);
		studentsList.add(student4);
		Student student2 = new Student("lisi",70);
		studentsList.add(student2);
		List<Student> students = Arrays.asList(student1,student2,student3,student4);
		System.out.println(students);//居然会自动排序
		
		System.out.println(studentsList);
		
		//类名::静态方法名
//		studentsList.sort(Student::compareStudentByScore);
//		studentsList.forEach(System.out::println);
		System.out.println("******************************");
		
		//类名::实例方法名
//		studentsList.sort(Student::compareByScore);
//		studentsList.forEach(System.out::println);
		
		//对象::实例方法名
//		StudentComparator studentComparator = new StudentComparator();
//		studentsList.sort(studentComparator::compareStudentByScore);
//		studentsList.forEach(System.out::println);
		
		//对象::静态方法名  编译报错
//		StudentComparator studentComparator = new StudentComparator();
//		studentsList.sort(studentComparator::compareByScore);

		//类名::new (构造器引用)
//		Function<String, Student> fun = (e) -> new Student(e);
//		Function<String, Student> fun = Student::new;
//		Student str = fun.apply("xiaoming");
//		System.out.println(str);
	}
}
class StudentComparator {
    public int compareStudentByScore(Student student1,Student student2){
        return student2.getScore() - student1.getScore();
    }
    public static int compareByScore(Student student1,Student student2){
    	return student1.getScore() - student2.getScore();
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
    public static int compareStudentByScore(Student student1, Student student2) {
        return student1.getScore() - student2.getScore();
    }
	public int compareByScore(Student student){
		return this.getScore() - student.getScore();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}
	
}