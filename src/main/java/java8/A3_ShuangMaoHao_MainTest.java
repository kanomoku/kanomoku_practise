package java8;

public class A3_ShuangMaoHao_MainTest {
	public static void main(String[] args) {

		//A3_Person::new; 为create 的方法体。这种写法不需要传递参数
		A3_PersonFactory<A3_Person> personFactory = A3_Person::new;
		A3_Person person = personFactory.create("Peter", "Parker");
		System.out.println(person); 
	}

}
