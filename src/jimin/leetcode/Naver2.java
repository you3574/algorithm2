package jimin.leetcode;

import java.util.HashMap;

public class Naver2 {
	static String Solution(String S) {
		if(S.length()%2==0) {
			for(int i=0;i<S.length()/2;i++) {
				if(S.charAt(i)!=S.charAt(S.length()-(i+1))){
					if((S.charAt(i)=='?')&&(S.charAt(i)=='?'))
						;
				}
			}
		}
		else {
			
		}
		return "";
	}
	public static void main(String[] args) {
		
		System.out.println(Solution("?ab??a"));
	}
}
