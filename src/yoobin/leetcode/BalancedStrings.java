package yoobin.leetcode;

public class BalancedStrings {

	public static void main(String[] args) {
		System.out.println(balancedStringSplit("RLRRRLLRLL"));
		System.out.println(balancedStringSplit("LLLLRRRR"));
		System.out.println(balancedStringSplit("RLLLLRRRLR"));
	}

	public static int balancedStringSplit(String s) {

		int r = 0;
		int l = 0;
		int result = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'R')
				r++;
			else if (s.charAt(i) == 'L')
				l++;

			if (r == l) {
				result++;
				r = 0;
				l = 0;
			}
		}

		return result;
	}

}
