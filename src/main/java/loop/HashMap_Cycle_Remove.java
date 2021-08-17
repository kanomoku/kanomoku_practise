package loop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class HashMap_Cycle_Remove {
	@Test()
	public void entrySet() {
		Map<Integer, String> map = new HashMap();
		map.put(1, "Java");
		map.put(2, "JDK");
		map.put(3, "Spring Framework");
		map.put(4, "MyBatis framework");
		map.put(5, "Java中文社群");

		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			if (entry.getKey() == 1) {
				// 删除
				System.out.println("del:" + entry.getKey());
				iterator.remove();
			} else {
				System.out.println("show:" + entry.getKey());
			}
		}
		System.out.println("-1----------------------------------------------");

	}

	@Test()
	public void forEachEntrySet() {
		System.out.println("-2----------------------------------------------");
		Map<Integer, String> map1 = new HashMap();
		map1.put(1, "Java");
		map1.put(2, "JDK");
		map1.put(3, "Spring Framework");
		map1.put(4, "MyBatis framework");
		map1.put(5, "Java中文社群");
		for (Map.Entry<Integer, String> entry : map1.entrySet()) {
			if (entry.getKey() == 1) {
				// 删除
				System.out.println("del:" + entry.getKey());
				map1.remove(entry.getKey());
			} else {
				System.out.println("show:" + entry.getKey());
			}
		}
		System.out.println("-2----------------------------------------------");
	}

	@Test()
	public void Lambda() {
		System.out.println("-3----------------------------------------------");
		Map<Integer, String> map2 = new HashMap();
		map2.put(1, "Java");
		map2.put(2, "JDK");
		map2.put(3, "Spring Framework");
		map2.put(4, "MyBatis framework");
		map2.put(5, "Java中文社群");
		map2.forEach((key, value) -> {
			if (key == 1) {
				System.out.println("del:" + key);
				map2.remove(key);
			} else {
				System.out.println("show:" + key);
			}
		});
		System.out.println("-3----------------------------------------------");
	}
	@Test()
	public void Lambda2() {
		System.out.println("-4----------------------------------------------");
		Map<Integer, String> map2 = new HashMap();
		map2.put(1, "Java");
		map2.put(2, "JDK");
		map2.put(3, "Spring Framework");
		map2.put(4, "MyBatis framework");
		map2.put(5, "Java中文社群");
		map2.keySet().removeIf(key -> key == 1);
		map2.forEach((key, value) -> {
		    System.out.println("show:" + key);
		});
		System.out.println("-4----------------------------------------------");
	}
	@Test()
	public void Stream() {
		System.out.println("-5----------------------------------------------");
		Map<Integer, String> map2 = new HashMap();
		map2.put(1, "Java");
		map2.put(2, "JDK");
		map2.put(3, "Spring Framework");
		map2.put(4, "MyBatis framework");
		map2.put(5, "Java中文社群");
		map2.entrySet().stream().forEach((entry) -> {
		    if (entry.getKey() == 1) {
		        System.out.println("del:" + entry.getKey());
		        map2.remove(entry.getKey());
		    } else {
		        System.out.println("show:" + entry.getKey());
		    }
		});
		System.out.println("-5----------------------------------------------");
	}
	@Test()
	public void Stream2() {
		System.out.println("-5----------------------------------------------");
		Map<Integer, String> map2 = new HashMap();
		map2.put(1, "Java");
		map2.put(2, "JDK");
		map2.put(3, "Spring Framework");
		map2.put(4, "MyBatis framework");
		map2.put(5, "Java中文社群");
		map2.entrySet().stream().filter(m -> 1 != m.getKey()).forEach((entry) -> {
		    if (entry.getKey() == 1) {
		        System.out.println("del:" + entry.getKey());
		    } else {
		        System.out.println("show:" + entry.getKey());
		    }
		});
		System.out.println("-5----------------------------------------------");
	}
}
