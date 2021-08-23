package collection_queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class ToQueue {
	@Test
	public void ArrayToQueue() {

		String nums[] = { "one", "two", "three", "four", "five" };
		Queue<String> queue = new LinkedList<>();
		Collections.addAll(queue, nums);
		System.out.println(queue);
	}

	@Test
	public void QueueToArray() {
		Queue<String> queue = new LinkedList<>();
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		queue.add("five");

		String strArray[] = queue.toArray(new String[queue.size()]);
		System.out.println(Arrays.toString(strArray));

	}
}
