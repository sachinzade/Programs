package Programs;

import java.util.*;

public class ArraySubset {
	
	
	static boolean isSubset(int[] a1, int[] a2) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		int n = a1.length;
		int m = a2.length;
		
		for(int i = 0; i < n; i++) {
			if(!set.contains(a1[i])) {
				set.add(a1[i]);
			}
		}
		for(int i = 0; i < m; i++) {
			if(!set.contains(a2[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		int[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
		int[] a2 = {11, 3, 7, 1, 7};
		
		System.out.println(isSubset(a1, a2));
	}

}
