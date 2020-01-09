package jimin.leetcode;

import java.util.HashMap;

public class Ya2 {
	public static int solution(int[] ranks) {
		int max=-1;
		int count=0;
		HashMap<Integer, Integer> map = new HashMap();
		for(int i=0;i<ranks.length;i++) {
			if(map.containsKey(ranks[i])) {
				map.put(ranks[i],map.get(ranks[i])+1);
			}
			else
				map.put(ranks[i],1);
			if(ranks[i]>max)
				max=ranks[i];
		}
		
		for(int j=0;j<max;j++)
		{
			if(map.containsKey(j)&&map.containsKey(j+1))
					count+=map.get(j);
		}
		return count;
	}
	
	public static void main(String[] args) {
		int array1[]= {3,4,3,0,2,2,3,0,0};
		int array2[]= {4,2,0};
		int array3[]= {4,4,3,3,1,0};
		System.out.println(solution(array3));
	}
}
