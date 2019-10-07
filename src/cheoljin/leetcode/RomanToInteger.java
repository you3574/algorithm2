package cheoljin.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = solution(s);
        System.out.println(result);
    }

    static int solution(String s) {
        int result = 0;
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        String[] slice = s.split("");
        for (int i = 0; i < slice.length; i++) {
            if (slice[i].equals("I") && i != slice.length - 1) {
                if ((slice[i + 1].equals("V") || slice[i + 1].equals("X")) && i != slice.length - 1) {
                    int num = roman.get(slice[i+1]) - roman.get(slice[i]);
                    result += num;
                    i++;
                } else {
                    result += roman.get(slice[i]);
                }
            } else if (slice[i].equals("X") && i != slice.length - 1) {
                if (slice[i + 1].equals("L")) {
                    i++;
                    result += 40;
                } else if (slice[i + 1].equals("C")) {
                    i++;
                    result += 90;
                } else {
                    result += roman.get(slice[i]);
                }
            } else if (slice[i].equals("C") && i != slice.length - 1) {
                if (slice[i + 1].equals("D")) {
                    i++;
                    result += 400;
                } else if (slice[i + 1].equals("M")) {
                    i++;
                    result += 900;
                } else {
                    result += roman.get(slice[i]);
                }
            } else {
                result += roman.get(slice[i]);
            }
        }
        return result;
    }
}
