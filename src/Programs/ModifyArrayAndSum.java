package Programs;

public class ModifyArrayAndSum {

	static void maxSum(int[] a) {
		int sum = 0;
		int r = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				r = 0 - a[i];
				sum += r;
			}
			if (a[i] > 0) {
				sum += a[i];
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, -3, 4, 5 };
		int[] b = { 5, -2, 5, -4, 5, -12, 5, 5, 5, 20 };
		maxSum(b);
	}
}
