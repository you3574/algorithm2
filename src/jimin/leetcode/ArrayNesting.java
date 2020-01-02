package jimin.leetcode;

public class ArrayNesting {
    public static int arrayNesting(int[] nums) {
        return 0;
    }
    public static void main(String[] args) {
    	int[] array= {5,4,0,3,1,6,2};
    	System.out.println(arrayNesting(array));
	}
}
/*
Input: A = [5,4,0,3,1,6,2]
Output: 4
Explanation: 
A[0] = 5, A[1] = 4, A[2] = 0, A[3] = 3, A[4] = 1, A[5] = 6, A[6] = 2.

One of the longest S[K]:
S[0] = {A[0], A[5], A[6], A[2]} = {5, 6, 2, 0}
*/