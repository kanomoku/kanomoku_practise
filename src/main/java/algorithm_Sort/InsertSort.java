package algorithm_Sort;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {

//		int[] array = new int[] { 5, 8, 2, 6, 3, 9, 2, 1, 7 };
		int[] array = new int[] { 9, 8};
		sort(array);
		System.out.println("最终结果：");
		System.out.println(Arrays.toString(array));
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int insertValue = arr[i];
			int j = i - 1;
			for (; j >= 0 && arr[j] > insertValue; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = insertValue;
			System.out.println(Arrays.toString(arr));
		}
	}

}
