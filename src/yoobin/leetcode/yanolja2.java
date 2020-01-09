package yoobin.leetcode;

import java.util.*;

public class yanolja2 {

	public static int yanolja2(int[] ranks) {

		int result = 0;
		 int j = 0;
		int z = 0;
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		for (int i = 0; i < ranks.length; i++)
			integerList.add(ranks[i]);
		Collections.sort(integerList);
		System.out.println(integerList);

	//	for (int j = 0; j < integerList.size() - 1; j++) {
			//System.out.println(integerList.size());
			while (j < integerList.size()-1) {
				if (integerList.get(j) == integerList.get(j + 1)) {
					j++;
					z++;
				} else if (integerList.get(j + 1) - integerList.get(j) == 1) {
					result += z+1;
					//System.out.println(result);
					z = 0;
					j++;
				} else {
					z = 0;
					j++;
				}

			}
		

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 4, 3, 0, 2, 2, 3, 0, 0 };
		System.out.println(yanolja2(a));
		int[] b = { 4,2,0 };
		System.out.println(yanolja2(b));
		int[] c = { 4,4,3,3,1,0 };
		System.out.println(yanolja2(c));
	}

}
