package jimin.leetcode;

import java.util.ArrayList;

public class RemoveAll {
	 public static String removeDuplicates(String s, int k) {
		 
		 ArrayList<Character> chars = new ArrayList<Character>();
		 for (char c : s.toCharArray()) {
		   chars.add(c);
		 }
		 boolean different=false;
		  int count=1;
		  while(chars.size()>0) {
		  different=false;
		  for(int i=0;i<chars.size()-1;i++) {
			  
			  if(count!=k&&(chars.get(i)==chars.get(i+1))) {
				   count++;
			  }
			  else {
				  if(count==k) {
					  int temp=i;
					  for(;i>=(temp-(k-1));i--) {
						  System.out.println(i);
						  chars.remove(i);
					  }
					  
					  different=true;
				  }
				  count=1;
			  }
			  
			 
			  
		  }
		  for (char c : chars) {
			   System.out.print(c);
		   }
		  System.out.println();
		  
		  	if(!different)
		  		break;
		  }
		  
		  StringBuilder result = new StringBuilder(chars.size());
		  for (Character c : chars) {
		    result.append(c);
		  }
		  String output = result.toString();
	      return output;
	 }
	 
	 
	 /* 모범답안
	  StringBuilder sb = new StringBuilder(s);
        int[] count = new int[sb.length()];
        for (int i = 0; i < sb.length(); i++) {
            if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                count[i] = 1;
            } else {
                count[i] = count[i - 1] + 1;
                if (count[i] == k) {
                    sb.delete(i - k + 1, i + 1);
                    i = i - k;
                }
            }
        }
        return sb.toString();
	  */
	 
	 
	 
	 public static void main(String[] args) {
		 
		String s="yfttttfbbbbnnnnffbgffffgbbbbgssssgthyyyy";
		System.out.println(removeDuplicates(s,4));
	}
	 
}
