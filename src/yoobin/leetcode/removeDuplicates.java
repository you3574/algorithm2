package yoobin.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class removeDuplicates {

	public static String solution(String s, int k) {
	      
		StringBuilder sb=new StringBuilder(s);
		int [] count = new int[sb.length()]; //±â·Ï¿ë
		
		for(int i=0; i<sb.length(); i++) {
			if(i==0||sb.charAt(i)!=sb.charAt(i-1)) {
				count[i]=1;
			}else {
				count[i]=count[i-1]+1;
					if(count[i]==k) {
						sb.delete(i-k+1,i+1);
						i=0;
						//System.out.println(i=i-k);
					}
				
			}
		}
		return sb.toString();
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(solution("aaaccffbb", 3));
		System.out.println(solution("deeedbbcccbdaa",3));
		System.out.println(solution("pbbcggttciiippooaais",2));
	}

}
