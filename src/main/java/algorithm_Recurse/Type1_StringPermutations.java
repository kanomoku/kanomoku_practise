package algorithm_Recurse;

/**
 * @author Administrator 
 * 	需要回头再去理解
 */
public class Type1_StringPermutations {

	public static void main(String[] args) {
		Type1_StringPermutations.getStringPermutations(new char[] { '1', '2', '3', '4', '5' }, 2, 4);
	}

	/**
	 * @description 从字符串数组中每次选取一个元素，作为结果中的第一个元素;然后，对剩余的元素全排列
	 * @author rico
	 * @param s    字符数组
	 * @param from 起始下标
	 * @param to   终止下标
	 */
	public static void getStringPermutations(char[] s, int from, int to) {
		if (s != null && to >= from && to < s.length && from >= 0) { // 边界条件检查
			if (from == to) { // 递归终止条件
				System.out.println(s); // 打印结果
			} else {
				for (int i = from; i <= to; i++) {
					swap(s, i, from); // 交换前缀,作为结果中的第一个元素，然后对剩余的元素全排列
					getStringPermutations(s, from + 1, to); // 递归调用，缩小问题的规模
					swap(s, from, i); // 换回前缀，复原字符数组
				}
			}
		}
	}

	/**
	 * @description 对字符数组中的制定字符进行交换
	 * @author rico
	 * @param s
	 * @param from
	 * @param to
	 */
	public static void swap(char[] s, int from, int to) {
		char temp = s[from];
		s[from] = s[to];
		s[to] = temp;
	}

}
