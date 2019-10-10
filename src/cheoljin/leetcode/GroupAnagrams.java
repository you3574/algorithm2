package cheoljin.leetcode;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> result = solution(strs);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    static List<List<String>> solution(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, String> anagramMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("") || strs[i] == null) {
                if (anagramMap.containsKey("#")) {
                    anagramMap.put("#", anagramMap.get("#") + " " + "#");
                } else {
                    anagramMap.put("#", "#");
                }
            } else {
                String[] word = strs[i].split("");
                Arrays.sort(word, String.CASE_INSENSITIVE_ORDER);
                StringBuilder sb = new StringBuilder();
                for (String s : word) {
                    sb.append(s);
                }
                if (anagramMap.containsKey(sb.toString())) {
                    anagramMap.put(sb.toString(), anagramMap.get(sb.toString()) + " " + strs[i]);
                } else {
                    anagramMap.put(sb.toString(), strs[i]);
                }
            }
        }
        Set<String> keySet = anagramMap.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            List<String> anagramList = new ArrayList<>();
            String key = it.next().toString();
            if (String.valueOf(key.charAt(0)).equals("#")) {
                String[] word = anagramMap.get(key).split(" ");
                for (int i = 0; i < word.length; i++) {
                    anagramList.add("");
                }
                result.add(anagramList);
            } else {
                String[] anagramIndexArray = anagramMap.get(key).split(" ");
                anagramList = Arrays.asList(anagramIndexArray);
                result.add(anagramList);
            }
        }
        return result;
    }
}
