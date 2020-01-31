package yoobin.leetcode;

public class number4 {

	public static int solution(int A, int B) {
		int count = 0;
		int result = A * B;
		String binaryString = Integer.toBinaryString(result);
		System.out.println(binaryString);
		int[] num = new int[binaryString.length()];

		for (int i = 0; i < binaryString.length(); i++) {
			num[i] = binaryString.charAt(i);
			if (num[i] == '1') {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
