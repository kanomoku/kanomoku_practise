package collection_queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.junit.Test;

public class QueueExample {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<>();
		queue.add("one");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		System.out.println(queue);

		queue.remove("three");
		System.out.println(queue);
		System.out.println("Queue Size: " + queue.size());
		System.out.println("Queue Contains element 'two' or not? : " + queue.contains("two"));

		// To empty the queue
		queue.clear();
	}

	@Test
	public void QueueAddOperation() {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

		System.out.println(queue.add("one"));
		System.out.println(queue.add("two"));
		System.out.println(queue);
		System.out.println(queue.add("three"));
		// Exception in thread "main" java.lang.IllegalStateException: Queue full
		System.out.println(queue);
	}

	@Test
	public void QueueOfferOperation() {

		BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

		System.out.println(queue.offer("one"));
		System.out.println(queue.offer("two"));
		System.out.println(queue);
		System.out.println(queue.offer("three"));
		System.out.println(queue);
	}

	@Test
	public void QueueRemoveOperation() {
		Queue<String> queue = new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		// Exception in thread "main" java.util.NoSuchElementException
	}

	@Test
	public void QueuePollOperation() {
		Queue<String> queue = new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	}

	@Test
	public void QueueElementOperation() {
		Queue<String> queue = new LinkedList<>();
		queue.add("one");

		System.out.println(queue.element());
		System.out.println(queue);
		queue.clear();
		System.out.println(queue.element());
		//Exception in thread "main" java.util.NoSuchElementException
	}
	
	@Test
	public void QueuePeekOperation() {
		Queue<String> queue = new LinkedList<>();
		queue.add("one");
			
		System.out.println(queue.peek());
		System.out.println(queue);
		queue.clear();
		System.out.println(queue.peek());
	}
}
