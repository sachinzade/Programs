package Programs;

import java.util.Arrays;

public class Contiguous_SubArray_Maximum_Sum {

	public static void main(String args[]) {

		int n = 5;
		int[] arr = { 1, 2, 3, -7, 5 };
		int sum = 0;
		int max = 0;
		for (int i = 0; i < 5; i++) {
			// for (int j = i; j < 5; j++) {
			sum = sum + arr[i];
			// }
			if (sum > max) {
				max = sum;
			}
		}
		System.out.println(max);
		System.out.println("-------------------------------------------------");
		// If all element are negative then take the biggest negative element
		int m = 4;
		int[] arr1 = { -1, -2, -3, -4 };
		Arrays.sort(arr1);
		int max1 = arr1[arr1.length - 1];
		System.out.println(max1);

	}
}
