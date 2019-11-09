package cheoljin.leetcode;

public class BalancedStrings {
    public static void main(String[] args) {
        String s1 = "RLRRLLRLRL"; // 4
        String s2 = "RLLLLRRRLR"; // 3
        String s3 = "LLLLRRRR";
        int result = solution(s3);
        System.out.println(result);
    }

    static int solution(String s) {
        int result = 0;
        int r_count = 0;
        int l_count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (r_count == 0 && l_count == 0) {
                if (s.charAt(i) == 'R') {
                    r_count++;
                } else {
                    l_count++;
                }
            } else {
                if (s.charAt(i) == 'R') {
                    r_count++;
                } else {
                    l_count++;
                }
                if (r_count == l_count) {
                    result++;
                    r_count = 0;
                    l_count = 0;
                }
            }
        }
        return result;
    }
}
