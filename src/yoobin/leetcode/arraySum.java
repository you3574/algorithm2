package yoobin.leetcode;

import java.util.Random;

public class arraySum {

	public static int[] arraySum(int N) {

		while (true) {
			int[] number = new int[N];
			int result = 0;
			Random random = new Random();

			for (int i = 0; i < N; i++) {
				number[i] = random.nextInt(20)-10;
				result += number[i];
				//System.out.println(number[i]);

			}
			//System.out.println(result);
			if (result == 0) {
				return number;
			} else
				continue;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[];
		array=arraySum(3);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
