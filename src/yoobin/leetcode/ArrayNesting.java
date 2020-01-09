package yoobin.leetcode;

public class ArrayNesting {

	public static int arrayNesting(int[] nums) {
		
		int result = 0;

		for (int i = 0; i < nums.length; i++) {
			result = Math.max(result, exchange(nums, i));
		}
		return result;
	}
	public static int exchange(int[] nums, int i) {

		int num = i;
		int eLen = 0;
		while (nums[num] != -1) {
			int temp = nums[num];
			nums[num] = -1;
			num = temp;
			eLen++;
		}
		return eLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 0 };
		System.out.println(arrayNesting(a));
	}

}
