package jimin.leetcode;

public class Ya4 {
	public static int solution(String S) {
		int count=0;
		int N=0;
		char[] chs=S.toCharArray();
		//2진수 -> 10진수
		for(int i=0;i<chs.length;i++) {
			N+=Math.pow(2,chs.length-(1+i))*(chs[i]-'0');
		}
		while(N!=0) {
			if(N%2==0) {
				N/=2;
				count++;
			}
			else {
				N--;
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String s="011100";
		System.out.println(solution(s));
	}
}
