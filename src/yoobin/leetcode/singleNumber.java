package yoobin.leetcode;

public class singleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aaa = { 4,1,2,1,2 };
		System.out.println(singleNumber(aaa));
	}

	public static int singleNumber(int[] nums) {

		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
		}

		return result;

	}

}
