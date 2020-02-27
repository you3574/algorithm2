package yoobin.socar;

import java.util.*;

public class number2 {

	public static String[] solution(String[][] friends, String user_id) {

		ArrayList<String> friend = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<>();
		Set<String> set = new HashSet<String>();

		int num = 0;
		// int result = 0;

		// user_id�� ¦ ã��
		for (int i = 0; i < friends.length; i++) {
			if (friends[i][0] == user_id) {
				friend.add(friends[i][1]);
			}
			if (friends[i][1] == user_id) {
				friend.add(friends[i][0]);
			}
		}

		// map���� ģ���� �� �� �ִ� ����� �̸��� ��� ȣ��Ǿ����� ����Ǿ����� (�̸�,����)
		for (int i = 0; i < friends.length; i++) {
			// arrayList�� friends[i][0]��Ұ� ������ �� �� ¦ �ʿ� ����

			// user_id�Ÿ���
			if (friends[i][1] == user_id || friends[i][0] == user_id)
				continue;
			if (friend.contains(friends[i][0])) {
				// ���� ��Ұ� ����Ǿ������� +1����
				if (map.containsKey(friends[i][1])) {
					int result = map.get(friends[i][1]);
					map.put(friends[i][1], result + 1);
				} else
				// ��Ұ� ������ ���� ����
				{
					map.put(friends[i][1], 1);

				}

			} else if (friend.contains(friends[i][1])) {
				if (map.containsKey(friends[i][0])) {
					int result = map.get(friends[i][0]);
					map.put(friends[i][0], result + 1);
				} else
				// ��Ұ� ������ ���� ����
				{
					map.put(friends[i][0], 1);
				}
			}

		}

		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) >= 0) {
				maxEntry = entry; // compareTo�� �̿��� ���� ���� map���� maxEntry�� �����
				num++;
				set.add(maxEntry.getKey()); // �ߺ������ϰ� �ִ밪�� �ֱ�
			}
		}

		String[] answer = new String[num];

		int i = 0;
		for (String name : set) { // set�� �ִ� �� �迭�� �ֱ�
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