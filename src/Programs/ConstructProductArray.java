package Programs;

import java.util.Iterator;

public class ConstructProductArray {

	public static void main(String[] args) {

		int[] a = { 10, 3, 5, 6, 2 };
		int sum = 1;
		for (int i = 0; i < a.length; i++) {
			int k = a[i];
			for (int j = 0; j < a.length; j++) {
				if (k != a[j]) {
					sum = sum * a[j];
				}
			}
			System.out.println(sum);
			sum = 1;
		}
	}
}
