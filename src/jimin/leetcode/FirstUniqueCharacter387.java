package jimin.leetcode;

public class FirstUniqueCharacter387 {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if((i!=j)&&(c==s.charAt(j))){
                     count++;
                     break;
                }
            }
            if(count==0)
                return i;
        }
        return -1;
    }
}
