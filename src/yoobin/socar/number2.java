package yoobin.socar;

import java.util.*;

public class number2 {

	public static String[] solution(String[][] friends, String user_id) {

		ArrayList<String> friend = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<>();
		Set<String> set = new HashSet<String>();

		int num = 0;
		// int result = 0;

		// user_id값 짝 찾기
		for (int i = 0; i < friends.length; i++) {
			if (friends[i][0] == user_id) {
				friend.add(friends[i][1]);
			}
			if (friends[i][1] == user_id) {
				friend.add(friends[i][0]);
			}
		}

		// map에는 친구가 될 수 있는 사람의 이름과 몇번 호명되었는지 저장되어있음 (이름,개수)
		for (int i = 0; i < friends.length; i++) {
			// arrayList에 friends[i][0]요소가 있으면 그 옆 짝 맵에 저장

			// user_id거르기
			if (friends[i][1] == user_id || friends[i][0] == user_id)
				continue;
			if (friend.contains(friends[i][0])) {
				// 만약 요소가 저장되어있으면 +1해줌
				if (map.containsKey(friends[i][1])) {
					int result = map.get(friends[i][1]);
					map.put(friends[i][1], result + 1);
				} else
				// 요소가 없으면 새로 저장
				{
					map.put(friends[i][1], 1);

				}

			} else if (friend.contains(friends[i][1])) {
				if (map.containsKey(friends[i][0])) {
					int result = map.get(friends[i][0]);
					map.put(friends[i][0], result + 1);
				} else
				// 요소가 없으면 새로 저장
				{
					map.put(friends[i][0], 1);
				}
			}

		}

		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) >= 0) {
				maxEntry = entry; // compareTo를 이용해 제일 높은 map값이 maxEntry에 저장됨
				num++;
				set.add(maxEntry.getKey()); // 중복제거하고 최대값만 넣기
			}
		}

		String[] answer = new String[num];

		int i = 0;
		for (String name : set) { // set에 있는 값 배열에 넣기
			answer[i] = name;
			i++;
		}

		return answer;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] friends = { { "david", "frank" }, { "demi", "david" }, { "frank", "james" }, { "demi", "james" },
				{ "claire", "frank" } };

		String[][] friends2 = { { "david", "demi" }, { "frank", "demi" }, { "demi", "james" } };

		String[] result = solution(friends, "david");
		for (String v : result) {
			System.out.print(v + " ");
		}

	}
}