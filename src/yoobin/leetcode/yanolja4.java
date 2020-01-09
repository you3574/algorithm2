package yoobin.leetcode;

public class yanolja4 {

	public static int yanolja4(String s) {
		int result = 0;
		int num=0;

		num = Integer.parseInt(s, 2);
		while(num>0) {
			if(num%2==0) {
				num=num/2;
				result++;
			}else if(num%2==1) {
				num=num-1;
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(yanolja4("1111"));
	}

}
