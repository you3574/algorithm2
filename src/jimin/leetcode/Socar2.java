package jimin.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Socar2 {
	public static String[] solution(String[][] friends,String user_id) {
		
		ArrayList<String> myfriends=new ArrayList<String>();
		ArrayList<Integer> fcount=new ArrayList<Integer>();
		
		Set<String> set = new TreeSet<String>();
		//TreeSet�� �ߺ��� ������ ���� X, �Է��� ������� ���� X, ������������ ����
		
		for(int i=0;i<friends.length;i++) { 
			//�� ģ�� ã��
			if(friends[i][0].equals(user_id)) {
				myfriends.add(friends[i][1]);
				fcount.add(0);
			}	
			else if(friends[i][1].equals(user_id)) {
				myfriends.add(friends[i][0]);
				fcount.add(0);
			}
		}
		
		
		for (int j = 0; j < friends.length; j++) {
			
			if(friends[j][0].equals(user_id)||friends[j][1].equals(user_id)) //userId�� ��ġ�� ��� ���� �ݺ�����
				continue;
			
			for (int k = 0; k < myfriends.size(); k++) {
					
				if(friends[j][0].equals(myfriends.get(k))) {
					set.add(friends[j][1]);
					fcount.set(k,fcount.get(k)+1);
				}	
				else if(friends[j][1].equals(myfriends.get(k))) {
					set.add(friends[j][0]);
					fcount.set(k,fcount.get(k)+1);
				}
				
			}
		}
		
		String[] answer= new String[set.size()];
		int i=0;
	    for (String x : set) 
	        answer[i++] = x; 
	  
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		String[][] friends= {{"david","frank"},{"demi","david"},{"frank","james"},{"demi","james"},{"claire","frank"}};
		String[] result=solution(friends,"david");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
