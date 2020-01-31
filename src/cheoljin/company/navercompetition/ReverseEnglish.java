package cheoljin.company.navercompetition;

public class ReverseEnglish {
    public static void main(String[] args) {
        String s1 = "?ab??a"; // aabbaa
        String s2 = "bab??a"; // NO
        String s3 = "?a?"; // aaa

        String result = solution(s3);
        System.out.println(result);
    }

    static String solution(String S) {
        int left_index;
        int right_index;
        StringBuilder sb = new StringBuilder("");
        if (S.length() % 2 == 0) {
            right_index = S.length() / 2;
            left_index = right_index - 1;
        } else {
            sb.append(S.charAt(S.length() / 2));
            right_index = S.length() / 2 + 1;
            left_index = right_index - 2;
        }
        for (int i = 0; i < S.length() / 2; i++) {
            char left = S.charAt(left_index);
            char right = S.charAt(right_index);
            if (left == right || left == '?' || right == '?') {
                if (left == '?' && right == '?') {
                    sb.insert(0, 'a');
                    sb.append('a');
                } else if (left == '?') {
                    sb.insert(0, right);
                    sb.append(right);
                } else if (right == '?') {
                    sb.insert(0, left);
                    sb.append(left);
                }
            } else {
                return "NO";
            }
            left_index--;
            right_index++;
        }
        return sb.toString();
    }
}
