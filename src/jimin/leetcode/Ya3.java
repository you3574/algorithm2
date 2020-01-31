package jimin.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Ya3 {

	public static int solution(String S,String T) {
		int count=0;
		Set<Integer> set=new HashSet<Integer>();
		
		String[] start=S.split(":");
		String[] end=T.split(":");
		
		int[] startTime=new int [3];
		int[] endTime=new int [3];
		
		for(int a=0;a<3;a++) {
			startTime[a] = Integer.parseInt(start[a]);
			endTime[a] = Integer.parseInt(end[a]);
		}
		
		
		
		
		return count;
	}
	
	public static void main(String[] args) {
		String s1="15:15:00";
		String s2="15:15:12";
		System.out.println(solution(s1,s2));
	}

}
