package cheoljin.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2}; // 4
        System.out.println(solution(nums));
    }

    static int solution(int[] nums) {
        Map<Integer, Boolean> check = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (check.containsKey(nums[i])) {
                check.remove(nums[i]);
            } else {
                check.put(nums[i], true);
            }
        }
        Set<Integer> keySet = check.keySet();
        Iterator<Integer> it = keySet.iterator();
        return it.next();
    }
}
