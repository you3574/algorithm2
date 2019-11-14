package jimin.leetcode;

public class DailyTemperatures {
	public static int[] dailyTemperatures(int[] T) {
		int[] result=new int[T.length];
        int value;
        for(int i=0;i<T.length;i++) {
        	value=T[i];
        	for(int j=i+1;j<T.length;j++) {
        		if(T[j]>value) {
        			result[i]=j-i;
        			break;
        		}
        		if(j>=T.length)
        			result[i]=0;
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] result=dailyTemperatures(T);
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");
	}
}
