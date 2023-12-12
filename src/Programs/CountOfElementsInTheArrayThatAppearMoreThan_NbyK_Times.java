package Programs;

public class CountOfElementsInTheArrayThatAppearMoreThan_NbyK_Times {

	static void check(int[] a, int n, int k) {

		int r = n / k;
		// System.out.println(r);
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int s = a[i];
			for (int j = i + 1; j < a.length; j++) {
				if (s == a[j]) {
					count++;
					// int w = a[j];
				}
				if (a[j] > r) {
					// System.out.println(2);
					// count++;
					System.out.println(a[j]);
				}
			}
			
		}
		// System.out.println(count);
	}

	public static void main(String[] args) {

		int N = 8;
		int[] a = { 3, 1, 2, 2, 1, 2, 3, 3 };
		int k = 4;
		check(a, N, k);
	}

}
