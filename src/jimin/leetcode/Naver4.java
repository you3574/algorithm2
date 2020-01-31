package jimin.leetcode;

import java.util.HashMap;

public class Naver4 {
	static int Solution(int A,int B) {
		int value=A*B;
		int count=0;
		String s=Integer.toBinaryString(value);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1')
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		System.out.println(Solution(3,7));
	}
}
