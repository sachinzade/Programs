package Programs;

public class CheckArrayPalindrome {

	static int palin(int[] a, int n) {

		for (int i = 0; i < n; i++) {
			int b = a[i];
			int sum = 0;
			while (b != 0) {
				int rem = b % 10;
				sum = sum * 10 + rem;
				b = b / 10;
			}
			if (sum != a[i]) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {

		int[] a = { 111, 222, 333, 444, 555 };
		int n = a.length;
		System.out.println(palin(a, n));
		
	}

}
