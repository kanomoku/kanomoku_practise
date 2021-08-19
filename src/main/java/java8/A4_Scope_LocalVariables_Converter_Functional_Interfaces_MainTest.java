package java8;

//Lamda 表达式作用域(Lambda Scopes)
public class A4_Scope_LocalVariables_Converter_Functional_Interfaces_MainTest {
	public static void main(String[] args) {

		int num = 1; // num可以不用声明为final,num 必须不可被后面的代码修改,在lambda表达式中试图修改num同样是不允许的。
		A2_Converter_Functional_Interfaces<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
		// num = 3; //上面会报错
		stringConverter.convert(2); // 3
		// num = 3; //上面会报错
		System.out.println(num);
	}

}
