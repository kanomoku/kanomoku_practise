package algorithm_Sort;

public class ArrayTraversalPractise {
	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		// 1 2 3 4 5 6 7 8 9 10 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + "  ");
		}
		// 11 10 9 8 7 6 5 4 3 2 1

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + "  ");
		}
		// 1 2 3 4 5 6 7 8 9 10 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println();
		}
		// 1 1 1 1 1 1 1 1 1 1 1
		// 2 2 2 2 2 2 2 2 2 2 2
		// 3 3 3 3 3 3 3 3 3 3 3
		// 4 4 4 4 4 4 4 4 4 4 4
		// 5 5 5 5 5 5 5 5 5 5 5
		// 6 6 6 6 6 6 6 6 6 6 6
		// 7 7 7 7 7 7 7 7 7 7 7
		// 8 8 8 8 8 8 8 8 8 8 8
		// 9 9 9 9 9 9 9 9 9 9 9
		// 10 10 10 10 10 10 10 10 10 10 10
		// 11 11 11 11 11 11 11 11 11 11 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int j = arr.length - 1; j >= 0; j--) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 11 11 11 11 11 11 11 11 11 11 11
		// 10 10 10 10 10 10 10 10 10 10 10
		// 9 9 9 9 9 9 9 9 9 9 9
		// 8 8 8 8 8 8 8 8 8 8 8
		// 7 7 7 7 7 7 7 7 7 7 7
		// 6 6 6 6 6 6 6 6 6 6 6
		// 5 5 5 5 5 5 5 5 5 5 5
		// 4 4 4 4 4 4 4 4 4 4 4
		// 3 3 3 3 3 3 3 3 3 3 3
		// 2 2 2 2 2 2 2 2 2 2 2
		// 1 1 1 1 1 1 1 1 1 1 1

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		// 1 2 3 4 5 6
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9 10 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println();
		}
		// 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		// 5 5 5 5 5
		// 6 6 6 6 6 6
		// 7 7 7 7 7 7 7
		// 8 8 8 8 8 8 8 8
		// 9 9 9 9 9 9 9 9 9
		// 10 10 10 10 10 10 10 10 10 10
		// 11 11 11 11 11 11 11 11 11 11 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= arr.length - 1 - i; j--) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 11
		// 11 10
		// 11 10 9
		// 11 10 9 8
		// 11 10 9 8 7
		// 11 10 9 8 7 6
		// 11 10 9 8 7 6 5
		// 11 10 9 8 7 6 5 4
		// 11 10 9 8 7 6 5 4 3
		// 11 10 9 8 7 6 5 4 3 2
		// 11 10 9 8 7 6 5 4 3 2 1

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < arr.length - i; j++) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println();
		}
		// 11
		// 10 10
		// 9 9 9
		// 8 8 8 8
		// 7 7 7 7 7
		// 6 6 6 6 6 6
		// 5 5 5 5 5 5 5
		// 4 4 4 4 4 4 4 4
		// 3 3 3 3 3 3 3 3 3
		// 2 2 2 2 2 2 2 2 2 2
		// 1 1 1 1 1 1 1 1 1 1 1

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 1 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println();
		}
		// 1 1 1 1 1 1 1 1 1 1 1
		// 2 2 2 2 2 2 2 2 2 2
		// 3 3 3 3 3 3 3 3 3
		// 4 4 4 4 4 4 4 4
		// 5 5 5 5 5 5 5
		// 6 6 6 6 6 6
		// 7 7 7 7 7
		// 8 8 8 8
		// 9 9 9
		// 10 10
		// 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= i; j--) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 11 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2
		// 11 10 9 8 7 6 5 4 3
		// 11 10 9 8 7 6 5 4
		// 11 10 9 8 7 6 5
		// 11 10 9 8 7 6
		// 11 10 9 8 7
		// 11 10 9 8
		// 11 10 9
		// 11 10
		// 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int j = arr.length - 1; j >= 0; j--) {
			for (int i = arr.length - 1 - j; i < arr.length; i++) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 11 11 11 11 11 11 11 11 11 11 11
		// 10 10 10 10 10 10 10 10 10 10
		// 9 9 9 9 9 9 9 9 9
		// 8 8 8 8 8 8 8 8
		// 7 7 7 7 7 7 7
		// 6 6 6 6 6 6
		// 5 5 5 5 5
		// 4 4 4 4
		// 3 3 3
		// 2 2
		// 1

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1 - i; j < arr.length; j++) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 11
		// 10 11
		// 9 10 11
		// 8 9 10 11
		// 7 8 9 10 11
		// 6 7 8 9 10 11
		// 5 6 7 8 9 10 11
		// 4 5 6 7 8 9 10 11
		// 3 4 5 6 7 8 9 10 11
		// 2 3 4 5 6 7 8 9 10 11
		// 1 2 3 4 5 6 7 8 9 10 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 1 2 3 4 5 6 7 8 9 10 11
		// 2 3 4 5 6 7 8 9 10 11
		// 3 4 5 6 7 8 9 10 11
		// 4 5 6 7 8 9 10 11
		// 5 6 7 8 9 10 11
		// 6 7 8 9 10 11
		// 7 8 9 10 11
		// 8 9 10 11
		// 9 10 11
		// 10 11
		// 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 1
		// 2 1
		// 3 2 1
		// 4 3 2 1
		// 5 4 3 2 1
		// 6 5 4 3 2 1
		// 7 6 5 4 3 2 1
		// 8 7 6 5 4 3 2 1
		// 9 8 7 6 5 4 3 2 1
		// 10 9 8 7 6 5 4 3 2 1
		// 11 10 9 8 7 6 5 4 3 2 1

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1 - i; j >= 0; j--) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 11 10 9 8 7 6 5 4 3 2 1
		// 10 9 8 7 6 5 4 3 2 1
		// 9 8 7 6 5 4 3 2 1
		// 8 7 6 5 4 3 2 1
		// 7 6 5 4 3 2 1
		// 6 5 4 3 2 1
		// 5 4 3 2 1
		// 4 3 2 1
		// 3 2 1
		// 2 1
		// 1

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1 - i; j < arr.length; j++) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println();
		}
		// 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		// 5 5 5 5 5
		// 6 6 6 6 6 6
		// 7 7 7 7 7 7 7
		// 8 8 8 8 8 8 8 8
		// 9 9 9 9 9 9 9 9 9
		// 10 10 10 10 10 10 10 10 10 10
		// 11 11 11 11 11 11 11 11 11 11 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println();
		}
		// 1 1 1 1 1 1 1 1 1 1 1
		// 2 2 2 2 2 2 2 2 2 2
		// 3 3 3 3 3 3 3 3 3
		// 4 4 4 4 4 4 4 4
		// 5 5 5 5 5 5 5
		// 6 6 6 6 6 6
		// 7 7 7 7 7
		// 8 8 8 8
		// 9 9 9
		// 10 10
		// 11

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int j = arr.length - 1; j >= 0; j--) {
			for (int i = j; i < arr.length; i++) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 11
		// 10 10
		// 9 9 9
		// 8 8 8 8
		// 7 7 7 7 7
		// 6 6 6 6 6 6
		// 5 5 5 5 5 5 5
		// 4 4 4 4 4 4 4 4
		// 3 3 3 3 3 3 3 3 3
		// 2 2 2 2 2 2 2 2 2 2
		// 1 1 1 1 1 1 1 1 1 1 1

		System.out.println();
		System.out.println("------------------------------------------------");
		for (int j = arr.length - 1; j >= 0; j--) {
			for (int i = arr.length - 1 - j; i < arr.length; i++) {
				System.out.print(arr[j] + "  ");
			}
			System.out.println();
		}
		// 11 11 11 11 11 11 11 11 11 11 11
		// 10 10 10 10 10 10 10 10 10 10
		// 9 9 9 9 9 9 9 9 9
		// 8 8 8 8 8 8 8 8
		// 7 7 7 7 7 7 7
		// 6 6 6 6 6 6
		// 5 5 5 5 5
		// 4 4 4 4
		// 3 3 3
		// 2 2
		// 1

	}
}
