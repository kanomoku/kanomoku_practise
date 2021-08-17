package reflection;

public class C4_TestMain {
	public static void main(String[] args) {
		// 创建一个Question对象 对象的控制权交由别人处理 MySpring类 IOC
		C1_MySpring spring = new C1_MySpring();
//        Question question = (Question) spring.getBean("reflection.Question");
//        System.out.println(question);

		C2_Person person = (C2_Person) spring.getBean("reflection.Person");
		System.out.println(person);
	}
}
