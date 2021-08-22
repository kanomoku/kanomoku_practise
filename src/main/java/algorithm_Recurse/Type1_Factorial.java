package algorithm_Recurse;

/**
 * Title: 阶乘的实现 Description: 递归解法 非递归解法
 * 
 * @author rico
 */
public class Type1_Factorial {
	public static void main(String[] args) {
		long res = Type1_Factorial.f(5);
		System.out.println();
	}

	/**
	 * @description 阶乘的递归实现
	 * @author rico
	 * @created 2017年5月10日 下午8:45:48
	 * @param n
	 * @return
	 */
	public static long f(int n) {
		if (n == 1) { // 1). 明确递归终止条件
			return 1; // 2). 给出递归终止时的处理办法
		}

		return n * f(n - 1); // 3). 提取重复的逻辑，缩小问题规模*
	}

//--------------------------------我是分割线-------------------------------------

	/**
	 * @description 阶乘的非递归实现
	 * @author rico
	 * @created 2017年5月10日 下午8:46:43
	 * @param n
	 * @return
	 */
	public static long f_loop(int n) {
		long result = n;
		while (n > 1) {
			n--;
			result = result * n;
		}
		return result;
	}
}