package collection_stack;

import java.util.Stack;

import org.junit.Test;

public class StackBasicExample {
	public static void main(String a[]) {
		Stack<Integer> stack = new Stack<>();
		System.out.println("Empty stack : " + stack);
		System.out.println("Empty stack : " + stack.isEmpty());
		stack.push(1001);
		stack.push(1002);
		stack.push(1003);
		stack.push(1004);
		System.out.println("Non-Empty stack : " + stack);
		System.out.println("Non-Empty stack: Pop Operation : " + stack.pop());
		System.out.println("Non-Empty stack : After Pop Operation : " + stack);
		System.out.println("Non-Empty stack : search() Operation : " + stack.search(1002));
		System.out.println("Non-Empty stack : " + stack.isEmpty());
	}

	@Test
	public void test() {
//         Exception in thread "main" java.util.EmptyStackException
		Stack<Integer> stack = new Stack<>();
		System.out.println("Empty stack : Pop Operation : " + stack.pop());
	}
}
