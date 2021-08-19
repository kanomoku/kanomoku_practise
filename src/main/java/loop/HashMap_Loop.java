package loop;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * https://blog.csdn.net/yangliangliang2011/article/details/88641600
 * https://mp.weixin.qq.com/s/zQBN3UvJDhRTKP6SzcZFKw
 */
public class HashMap_Loop {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = 1000_0000;
		for (int i = 1; i <= n; i++) {
			map.put(i, i);
		}

		// 1.迭代器 EntrySet
		long before1 = System.currentTimeMillis();
		Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			Map.Entry<Integer, Integer> entry = entries.next();
			Integer key = entry.getKey();
			Integer value = entry.getValue();
		}
		long after1 = System.currentTimeMillis();
		System.out.println("map.entrySet().iterator() time=\t" + (after1 - before1));
		//----------------------------------------------------------------------------------------------------
		
		// 2.迭代器 KeySet
		long before11 = System.currentTimeMillis();
		Iterator<Integer> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next();
			Integer value = map.get(iterator.next());
		}
		long after11 = System.currentTimeMillis();
		System.out.println("map.keySet().iterator() time=\t" + (after11 - before11));
		//----------------------------------------------------------------------------------------------------
		
		// 3.ForEach EntrySet 这是最常用的方式
		long before = System.currentTimeMillis();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
		}
		long after = System.currentTimeMillis();
		System.out.println("map.entrySet() time=\t" + (after - before));
		//---------------------------------------------------------------------------------------------------
		
		// 4.ForEach KeySet
		long before2 = System.currentTimeMillis();
		for (Integer key : map.keySet()) {
			Integer key1 = key;
			Integer value = map.get(key1);;
		}
		long after2 = System.currentTimeMillis();
		System.out.println("map.keySet() time=\t" + (after2 - before2));
		//---------------------------------------------------------------------------------------------------
		
		// 5.Lambda
		long before3 = System.currentTimeMillis();
		map.forEach((key, value) -> {
			Integer key1 = key;
			Integer value1 = value;

		});
		long after3 = System.currentTimeMillis();
		System.out.println("map.forEach time=\t" + (after3 - before3));
		//---------------------------------------------------------------------------------------------------
		
		// 6.Streams API 单线程
		long before4 = System.currentTimeMillis();
		map.entrySet().stream().forEach((entry) -> {
			Integer key = entry.getKey();
			Integer value1 = entry.getValue();
		});
		long after4 = System.currentTimeMillis();
		System.out.println("map.entrySet().stream().forEach time=\t" + (after4 - before4));
		//---------------------------------------------------------------------------------------------------
		
		// 7.Streams API 多线程
		long before5 = System.currentTimeMillis();
		map.entrySet().parallelStream().forEach((entry) -> {
			Integer key = entry.getKey();
			Integer value1 = entry.getValue();
		});
		long after5 = System.currentTimeMillis();
		System.out.println("map.entrySet().parallelStream().forEach time=\t" + (after5 - before5));
		
		//---------------------------------------------------------------------------------------------------
		long before6 = System.currentTimeMillis();
		for (Integer value : map.values()) {
			Integer value1 = value;
		}
		long after6 = System.currentTimeMillis();
		System.out.println("map.values() time=\t" + (after6 - before6));
		
		//---------------------------------------------------------------------------------------------------
		long before7 = System.currentTimeMillis();
		Iterator<Integer> iteratorValues = map.values().iterator();
		while (iteratorValues.hasNext()) {
			Integer value1 = iteratorValues.next();
		}
		long after7 = System.currentTimeMillis();
		System.out.println("map.values().iterator() time=\t" + (after7 - before7));
	}

	public HashMap_Loop() {
	}

}
