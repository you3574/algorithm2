package yoobin.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class number1 {

	public static int solution(String[] A) {

		String[] candidates = A;
		String[] new_candidates = null;
		int max_len = 0;
		TreeSet t = new TreeSet();
		ArrayList resultList = new ArrayList<String>();
		
		
		for(int i=0; i<A.length; i++) {
			for(int j=0; j<A[i].length(); j++) {
				t.add(A[i].charAt(j));
			}
			if(A[i].length()==t.size()) {
				new_candidates[i]=A[i];
				if(max_len<A[i].length()) {
					max_len=A[i].length();
				}
			}
		}
		
		candidates=new_candidates;
		new_candidates=null;
		
		for (int i = 0; i < candidates.length; i++) {
			for (int j = 0; j < candidates.length; j++) {
				t.add(candidates[i] + candidates[j]);
			}
		}
		
		
		
	/*
		for(int i=0; i<)
			charAt(i)wwww
		for (int i = 0; i < A.length; i++) {
			t.add(A[i]);
		}

		Iterator<String> it = t.iterator();
		int x = 0;
		while (it.hasNext()) {
			
			System.out.println(it.next());			
		}
*/

		
		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] A = { "aaa", "ttt", "def" };
		System.out.println(solution(A));
	}

}
