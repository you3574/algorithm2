package cheoljin.company.navercompetition;

import java.util.*;

public class StringCombination {
    public static void main(String[] args) {
        String[] A1 = {"co", "dil", "ity"}; // 5
        String[] A2 = {"abc", "yyy", "def", "csv"}; // 6
        String[] A3 = {"potato", "kayak", "banana", "racecar"}; // 0
        String[] A4 = {"eva", "jqw", "tyn", "jan"}; // 9

        int result = solution(A4);
        System.out.println(result);
    }

    static int solution(String[] A) {
        List<String> strList = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (doubleCheck(A[i])) {
                strList.add(A[i]);
            }
        }
        StringBuilder sb = new StringBuilder("");
        merge(sb, strList, 0);
        for(String v : mySet) {
            result = Math.max(result, v.length());
        }
        return result;
    }

    static boolean doubleCheck(String str) {
        Map<Character, Boolean> myMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (myMap.containsKey(str.charAt(i))) {
                return false;
            } else {
                myMap.put(str.charAt(i), true);
            }
        }
        return true;
    }

    static void merge(StringBuilder sb, List<String> strList, int index) {
        if(index == strList.size()) {
            mySet.add(sb.toString());
        } else {
            String str = strList.get(index);
            StringBuilder makeSb = new StringBuilder();
            makeSb.append(sb.toString()).append(str);
            index++;
            if(doubleCheck(makeSb.toString())) {
                merge(sb, strList, index);
                merge(makeSb, strList, index);
            } else {
                merge(sb, strList, index);
            }
        }
    }

    static Set<String> mySet = new HashSet<>();
}
