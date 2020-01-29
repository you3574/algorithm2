package yoobin.leetcode;

import java.util.*;

public class number2 {

	public static String solution(String S) {

		String result;
		double num = S.length();
		int num2 = (int) Math.floor(num / 2);
		// System.out.println(num2);
		String no = "NO";

		StringBuilder sb = new StringBuilder(S);

		for (int i = 0; i < num2; i++) {
			if (sb.charAt(i) == '?') {
				// sb.setCharAt(S.length()-i)=S.charAt(i);
				if (sb.charAt(sb.length() - i - 1) == '?') {
					sb.setCharAt(i, 'z');
					sb.setCharAt(sb.length() - i - 1, 'z');

				} else if (sb.charAt(sb.length() - i - 1) != '?') {
					char a = sb.charAt(sb.length() - i - 1);
					//System.out.println(a);
					sb.setCharAt(i, a);

				}
			} else if (sb.charAt(i) != '?') {
				if (sb.charAt(sb.length() - i - 1) == '?') {
					char a = sb.charAt(i);
					sb.setCharAt(sb.length() - i - 1, a);
				}else if(sb.charAt(sb.length()-i-1)!='?') {
					return no;
				}
			}

			else if (sb.charAt(i) != sb.charAt(sb.length() - i - 1)) {
				return no;
			}

		}
		result = sb.toString();

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aa?a??";
		System.out.println(solution(s));

		String s1 = "?ab??a";
		System.out.println(solution(s1));
		
		String s2="bab??a";
		System.out.println(solution(s2));
		
		String s3="?a?";
		System.out.println(solution(s3));
	}

}
