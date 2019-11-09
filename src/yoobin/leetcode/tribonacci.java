package yoobin.leetcode;

public class tribonacci {

	public static void main(String[] args) {
		for(int i=0; i<34; i++)
			 System.out.printf("%d: %d\n",  i, tribonacci(i));

	}

	public static int tribonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else
			return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
	}

}
