package algorithm_Sort;

import java.util.Arrays;

/**
 * https://mp.weixin.qq.com/s/wO11PDZSM5pQ0DfbQjKRQA
 *
 */
public class BubbleSort {
	public static void main(String[] args) {

		int[] array = new int[] { 5, 2, 8, 6, 3, 9, 2, 1, 7 };
		sort1(array);
		System.out.println("最终结果：");
		System.out.println(Arrays.toString(array));
	}

	public static void sort1(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) { // N个元素比较N-1轮
			for (int j = 0; j < arr.length - 1 - i; j++) { // 最后一位是 arr.length-2 不是 arr.length-1，j和j+1去比
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void sort2(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			boolean isSorteed = true;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSorteed = false;
				}
			}
			if (isSorteed) {
				break;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void sort3(int[] arr) {
		int temp = 0;
		int sortBorder = arr.length - 1;// 无界数据边界 因为是所有轮共用的所以拿到外面来
		int lastExchangeIndex = 0;
		for (int i = 0; i < arr.length - 1; i++) { // N个元素比较N-1轮
			boolean isSorteed = true;
			for (int j = 0; j < sortBorder; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSorteed = false;
					lastExchangeIndex = j;
				}
			}
			sortBorder = lastExchangeIndex;
			if (isSorteed) {
				break;
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
