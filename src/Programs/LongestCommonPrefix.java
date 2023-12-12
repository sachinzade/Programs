package Programs;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {

		String minStr = strs[0];

		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < minStr.length())
				minStr = strs[i];
		}
		int minStrLength = minStr.length();
		for (int i = 0; i < strs.length; i++) {
			int j;
			for (j = 0; j < minStrLength; j++) {
				if (minStr.charAt(j) != strs[i].charAt(j))
					break;
			}
			
			if (j < minStrLength)
				minStrLength = j;
		}
		return minStr.substring(0, minStrLength);
	}

	public static void main(String[] args) {

		String[] strs = { "geeksforgeeks", "geeks", "geek", "geezer" };
		System.out.println(longestCommonPrefix(strs));

	}

}
