package Programs;

public class StockPanProblem {

	static void check(int[] a) {
		int forMax = 0;
		int forMin = 1;
		int start = a[0];

		for (int i = 0; i < a.length; i++) {
			int k = a[i];
			if (start == k) {
				System.out.println(forMin);
			}
			for (int j = i + 1; j < a.length;) {
				if (k > a[j]) {
					System.out.println(forMin);
					break;
				} else {
					forMax = forMax + 2;
					System.out.println(forMax);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] a = { 100, 80, 60, 70, 60, 75, 85 };
		check(a);
	}

}
