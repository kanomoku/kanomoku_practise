package algorithm_Recurse;

public class Type1_Pascal {

	public static void main(String[] args) {
		long res = Type1_Pascal.getValue(3, 3);
		System.out.println(res);
	}

	/**
	 * @description 递归获取杨辉三角指定行、列(从0开始)的值 注意：与是否创建杨辉三角无关
	 * @author rico
	 * @x 指定行
	 * @y 指定列
	 */
	/**
	 * Title: 杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
	 * 它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
	 * 
	 * 例如，下面给出了杨辉三角形的前4行：
		     1 
	       1   1
	      1  2  1
	     1 3   3 1
		1 4  6  4 1
	   1 5 10 10 5 1
	    * 
	    * 
	    * 
	    * 
	 * @description 递归获取杨辉三角指定行、列(从0开始)的值 注意：与是否创建杨辉三角无关
	 * @author rico
	 * @x 指定行
	 * @y 指定列
	 */
	public static int getValue(int x, int y) {
		if (y >= 0 && y <= x) {// 取值行号任意，0 < = 列号 <= 行号
			if (y == 0 || x == y) { // 1). 明确递归终止条件
				return 1; // 2). 给出递归终止时的处理办法
			} else {
				// 3). 提取重复的逻辑，缩小问题规模
				return getValue(x - 1, y - 1) + getValue(x - 1, y);
			}
		}
		return -1;
	}
}
