package java8;

//Lamda 表达式作用域(Lambda Scopes)
public class A4_Scope_LocalVariables_Converter_Functional_Interfaces_MainTest2 {
	public static void main(String[] args) {

		new Lambda4().testScopes();
		System.out.println("===============================================");
		System.out.println("main  outerStaticNum1 " + Lambda4.outerStaticNum);
		System.out.println("main  outerStaticNum2 " + new Lambda4().outerStaticNum);
		System.out.println("main  outerNum " + new Lambda4().outerNum);

		
	}

}

class Lambda4 {
	static int outerStaticNum = 1;
	int outerNum = 2;

	void testScopes() {
		A2_Converter_Functional_Interfaces<Integer, String> stringConverter1 = (from) -> {
			outerNum = 23;
			System.out.println("outerNum1 " + outerNum);
			return String.valueOf(from + outerNum);
		};
		System.out.println("outerNum2 " + outerNum);
		String a = stringConverter1.convert(100);
		System.out.println("outerNum3 " + outerNum);
		System.out.println("结果" + a);

		
		System.out.println("===============================================");

		A2_Converter_Functional_Interfaces<Integer, String> stringConverter2 = (from) -> {
			outerStaticNum = 72;
			System.out.println("outerStaticNum1 " + outerStaticNum);
			return String.valueOf(from + outerStaticNum);
		};
		System.out.println("outerStaticNum2 " + outerStaticNum);
		String aa = stringConverter2.convert(100);
		System.out.println("outerStaticNum3 " + outerStaticNum);
		System.out.println("结果" + aa);

	}
}