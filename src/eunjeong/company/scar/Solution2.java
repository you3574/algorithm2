package eunjeong.company.scar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution2 {
	
	public static String[] solution(String[][] friends,String user_id) {
		
		ArrayList<String> my_friends= new ArrayList<String>();
		HashMap<String, Integer> mutual = new HashMap<String, Integer>();
		for(int i=0;i<friends.length;i++) {
			if(friends[i][0]==user_id) my_friends.add(friends[i][1]);
			if(friends[i][1]==user_id) my_friends.add(friends[i][0]);
		}
		for(int i=0;i<friends.length;i++) {
			if(friends[i][0]==user_id || friends[i][0]==user_id) continue;
			if(my_friends.contains(friends[i][0])) {
				int value=(mutual.get(friends[i][1])==null)? 1:mutual.get(friends[i][1])+1;
				mutual.put(friends[i][1], value);
			}
			if(my_friends.contains(friends[i][1])) {
				int value=(mutual.get(friends[i][0])==null)? 1:mutual.get(friends[i][0])+1;
				mutual.put(friends[i][0], value);
			}
		}
		int max=0;
		int count=0;
		for(Map.Entry<String, Integer> elem : mutual.entrySet()){
			 
            String key = elem.getKey();
            int value = elem.getValue();
 
            System.out.println(key+" : "+value);
 
        }
		
		String[] answer = {};
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] A= { {"david","frank"},{"demi", "david"},{"frank","james"},{"demi","james"},{"claire","frank"}};
		String[][] B= { {"david","demi"},{"frank","demi"},{"demi","james"}};
		System.out.println("answerA is "+solution(A,"david"));
		System.out.println("answerB is "+solution(B,"frank"));

	}

}
