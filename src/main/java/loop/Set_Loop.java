package loop;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.Test;

/**
 * https://blog.csdn.net/yangliangliang2011/article/details/88640653
 */
public class Set_Loop {

	@Test()
	public void iteratorTest() {
		Set<String> set = new HashSet<String>();
		set.add("大");
		set.add("中");
		set.add("小");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

	@Test()
	public void forEachTest() {
		Set<String> set = new HashSet<String>();
		set.add("大");
		set.add("中");
		set.add("小");
		for (String str : set) {
			System.out.println(str);
		}
	}
}