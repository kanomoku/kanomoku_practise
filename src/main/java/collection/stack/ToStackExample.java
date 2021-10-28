package collection.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class ToStackExample {
	@Test
	public void ArrayToStackExample() {

		Integer[] intArr = { 1001, 1002, 1003, 1004 };
		Stack<Integer> stack = new Stack<>();
		for (Integer i : intArr) {
			stack.push(i);
		}
		System.out.println("Non-Empty stack : " + stack);
	}

	@Test
	public void ListToStackExample() {
		Stack<Integer> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("Non-Empty list : " + list);
		System.out.println("Non-Empty stack addAll Operation : " + stack.addAll(list));
		System.out.println("Non-Empty stack : " + stack);
	}

	@Test
	public void StackToListExample() {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		List<Integer> list = new ArrayList<>();
		list.addAll(stack);
		System.out.println("Non-Empty stack : " + stack);
		System.out.println("Non-Empty List : " + list);
	}
}