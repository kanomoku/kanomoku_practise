package algorithm_Sort;

import java.util.Arrays;

public class ShellSort {
	public static void main(String[] args) {

		int[] array = new int[] { 5, 8, 2, 6, 3, 9, 2, 1, 7 };
		sort(array);
		System.out.println("最终结果：");
		System.out.println(Arrays.toString(array));
		System.out.println(9/2);
		System.out.println(6/2);
	}

	public static void sort2(int[] arr) {
		for (int d = arr.length / 2; d > 0; d /= 2) {
			for (int w = 0; w < d; w++) {
				for (int i = w + d; i < arr.length; i += d) {
					int insertValue  = arr[i];
					int j = i - d;
					for (; j >= 0 && arr[j] > insertValue ; j -= d) {
						arr[j + d] = arr[j];
					}
					arr[j + d] = insertValue ;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
	}

	 public static void sort(int[] arr) {
        int d = arr.length;
        while (d > 1) {
            d /= 2;
            for (int w = 0; w < d; w++) {
                for (int i = w + d; i < arr.length; i += d) {
                    int insertValue  = arr[i];
                    int j = i - d;
                    for (; j >= 0 && arr[j] > insertValue ; j -= d) {
                        arr[j + d] = arr[j];
                    }
                    arr[j + d] = insertValue ;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
}
