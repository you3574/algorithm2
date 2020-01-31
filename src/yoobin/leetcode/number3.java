package yoobin.leetcode;

public class number3 {

	public static int solution(int [] A) {
		
		int count = 0;
		
		for(int i=0; i<A.length-1; i++) {
			if(A[i]==A[i+1]) {
				if(A[i]==0) {
					A[i+1]=1;
				}else
					A[i+1]=0;
			}
			count++;
		}
		
		if(count>A.length/2) {
			count=A.length-count;
		}
		//System.out.println(count);
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A= {0,1,0,1,1};
		int [] B= {1,1,0,1,0,1};
		System.out.println(solution(A));
		System.out.println(solution(B));

	}

}
