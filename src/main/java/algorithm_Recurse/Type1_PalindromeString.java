package algorithm_Recurse;

/**
 * Title: 回文字符串的判断 Description: 回文字符串就是正读倒读都一样的字符串。如"98789", "abccba"都是回文字符串
 * 
 * 两种解法： 递归判断； 循环判断；
 * 
 * @author rico
 */
public class Type1_PalindromeString {

	public static void main(String[] args) {
		String a = "qadffdaq";
		System.out.println(Type1_PalindromeString.isPalindromeString_recursive(a));
		System.out.println("ab".substring( 1,1));
	}

	/**
	 * @description 递归判断一个字符串是否是回文字符串
	 * @author rico
	 * @created 2017年5月10日 下午5:45:50
	 * @param s
	 * @return
	 */
	public static boolean isPalindromeString_recursive(String s) {
		int start = 0;
		int end = s.length() - 1;
		if (end > start) { // 1). 明确递归终止条件；
			if (s.charAt(start) != s.charAt(end)) {
				return false; //2). 给出递归终止时的处理办法 
			} else {
				// 3). 提取重复的逻辑，缩小问题规模
//				return isPalindromeString_recursive(s.substring(start + 1).substring(0, end - 1));
				return isPalindromeString_recursive(s.substring(start + 1,end));
			}
		}
		return true;
	}

//--------------------------------我是分割线-------------------------------------

	/**
	 * @description 循环判断回文字符串
	 * @author rico
	 * @param s
	 * @return
	 */
	public static boolean isPalindromeString_loop(String s) {
		char[] str = s.toCharArray();
		int start = 0;
		int end = str.length - 1;
		while (end > start) { // 循环终止条件:两个指针相向移动，当start超过end时，完成判断
			if (str[end] != str[start]) {
				return false;
			} else {
				end--;
				start++;
			}
		}
		return true;
	}
}
