package Programs;

import java.util.*;

public class OccuranceOfElement {

	public static void main(String[] args) {

		int arr[] = { 3, 1, 3, 3, 2, 2};
		int n = arr.length;
		int count = 0;

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (map.get(arr[i]) == null) {
				map.put(arr[i], 1);
			} else {
				count = map.get(arr[i]);
				map.put(arr[i], ++count);
			}

		}

		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() > n / 2) {
				System.out.println(m.getKey());
			}
		}

		System.out.println("Occurance of element : \n " + map);
	}
}
