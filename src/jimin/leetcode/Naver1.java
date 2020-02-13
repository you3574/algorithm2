package jimin.leetcode;
import java.util.ArrayList;
import java.util.HashMap;

public class Naver1 {
	
	static int Solution(String[] A) {
		HashMap<Character, Integer> map = new HashMap();
		HashMap<Character, Integer> temp = new HashMap();
		int count=0;
		
		
			for(int i=0;i<A.length;i++){
				map.clear();
				temp.clear();
				for(int j=0;j<A[i].length();j++) {
					if(temp.containsKey(A[i].charAt(j)))
						break;
					else
					    temp.put(A[i].charAt(j),1);
					if(j==(A[i].length()-1))
						map.putAll(temp);
				}
			
				for(int k=0;k<A.length;k++) {
					temp=(HashMap<Character, Integer>) map.clone();
					if(k==i)
					  continue;
					
					for(int a=0;a<A[k].length();a++) {
						if(temp.containsKey(A[k].charAt(a))) {
							break;
						}
						else
						    temp.put(A[k].charAt(a),1);
						if(a==(A[k].length()-1))
							map.putAll(temp);
					}
					
				}
				if(map.size()>count)
					count=map.size();
				System.out.println(map.keySet()+" "+map.size());	
				
				
			} 
		
		return count;
	}
	public static void main(String[] args) {
		//String s[]= {"abc","yyy","def","csv"};
		//String s[]= {"co","dil","ity"};
		//String s[]= {"potato","kayak","banana","racecar"};
		String s[]= {"eva","jqw","tyn","jan"};
		System.out.println(Solution(s));
	}
}
