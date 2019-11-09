package jimin.leetcode;

public class LongPressedName {
	public boolean isLongPressedName(String name, String typed) {
        
        int nl=name.length();
        int tl=typed.length();
        int index=0;
        for(int i=0;i<tl;i++){
            char n=name.charAt(index);  //name의 index 위치의 문자
            char t=typed.charAt(i);     //typed의 i 위치의 문자
            
            if(n==t){   //위치의 문자가 같으면
                if((i==(tl-1))&&(index==(nl-1)))
                    break;
                else if((i==(tl-1))&&(index!=(nl-1)))
                    return false;
                if(index!=(nl-1))
                    index++;
                continue;
            }
            else{       //위치의 문자가 다르면
                if(((i==0)&&(index==0))||(i==(tl-1)))
                    return false;
                if(t==typed.charAt(i-1)){
                    continue;
                }
                else{
                    return false;
                }
            }
           
        }
         return true;
       
    }
}
