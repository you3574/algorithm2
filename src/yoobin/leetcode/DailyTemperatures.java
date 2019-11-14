package yoobin.leetcode;

public class DailyTemperatures {

	 public int[] dailyTemperatures(int[] T) {
		
		 int [] result=new int [T.length];
		 
		 for(int i=0; i<T.length; i++) {
			for(int j=i+1; j<T.length; j++) {
				if(T[i]<T[j]) {
					result[i]=(T[j]-T[i]);
					break;
				}
			}
			
			
			 
			}
		 
		 
		 return result;
	        
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
