package cheoljin.company;

import java.util.*;

public class MasterReport {
    public static void main(String[] args) {
        int[] ranks1 = {3, 4, 3, 0, 2, 2, 3, 0, 0}; // 5
        int[] ranks2 = {4, 2, 0}; // 0
        int[] ranks3 = {4, 4, 3, 3, 1, 0}; // 3

        System.out.println("result : " + solution(ranks1));
        System.out.println("result : " + solution(ranks2));
        System.out.println("result : " + solution(ranks3));
    }

    static int solution(int[] ranks) {
        int answer = 0;
        Set<Integer> soldiers = new HashSet<>();
        Map<Integer, Integer> soldiersCount = new HashMap<>();

        for (int i = 0; i < ranks.length; i++) {
            soldiers.add(ranks[i]);
            if (soldiersCount.containsKey(ranks[i])) {
                soldiersCount.put(ranks[i], soldiersCount.get(ranks[i]) + 1);
            } else {
                soldiersCount.put(ranks[i], 1);
            }
        }

        Iterator it = soldiers.iterator();
        while (it.hasNext()) {
            int soldierNum = Integer.parseInt(it.next().toString());
            if (soldiersCount.containsKey(soldierNum + 1)) {
                answer += soldiersCount.get(soldierNum);
            }
        }
        return answer;
    }
}
