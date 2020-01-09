package jimin.leetcode;
import java.util.*;
public class Ya1 {
	public static int[] solution(int N) {
		int array[]= new int[N];
		if(N%2==0) { //Â¦¼ö
			for(int i=0;i<N;i+=2) {
				array[i]=i+1;
				array[i+1]=-(i+1);
			}
		}
		else if(N%2==1) { //È¦¼ö
			array[0]=0;
			for(int i=1;i<N;i+=2) {
				array[i]=i;
				array[i+1]=-i;
			}	
		}
		
		return array;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=solution(n);
		
		for(int b=0;b<a.length;b++) {
			System.out.println(a[b]+" ");
		}
		
	}
}
