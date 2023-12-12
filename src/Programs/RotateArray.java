package Programs;

public class RotateArray {

	static void rotate(int[] a, int d, int n) {
		int[] temp = new int[n];
		int k = 0;
		for (int i = d; i < n; i++) {
			temp[k] = a[i];
			k++;
		}
		for (int i = 0; i < d; i++) {
			temp[k] = a[i];
			k++;
		}

		for (int i : temp) {
			System.out.print(i + " ");
		}

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int n = a.length;
		int d = 2;
		rotate(a, d, n);
	}

}
