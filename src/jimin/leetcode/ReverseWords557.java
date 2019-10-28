package jimin.leetcode;

public class ReverseWords557 {
	public String reverseWords(String s) {
        String[] array=s.split(" ");
        StringBuilder result=new StringBuilder();
         for(int j=0;j<array.length;j++){
            for(int i=(array[j].length()-1);i>=0;i--){
                result.append(Character.toString(array[j].charAt(i)));
            } 
            if(j!=(array.length-1))
             result.append(" ");
        }
        return result.toString();
    }
}
