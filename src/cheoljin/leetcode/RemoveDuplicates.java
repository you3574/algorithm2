package cheoljin.leetcode;

import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s1 = "abcd";
        int k1 = 2;

        String s2 = "deeedbbcccbdaa";
        int k2 = 3;

        String s3 = "pbbcggttciiippooaais";
        int k3 = 2;

        System.out.println(removeDuplicates(s3, k3));
    }

    static String removeDuplicates(String s, int k) {
        do {
            s = oneCalc(s, k);
        } while (!oneCalc(s, k).equals(s));
        return s;
    }

    static String oneCalc(String s, int k) {
        Stack<Character> alphabetStack = new Stack<>();
        int index = 0;
        while (index < s.length()) {
            if (alphabetStack.isEmpty()) {
                alphabetStack.push(s.charAt(index));
                index++;
            } else {
                if (alphabetStack.peek() == s.charAt(index)) {
                    if (alphabetStack.size() < k) {
                        alphabetStack.push(s.charAt(index));
                        if (alphabetStack.size() == k) {
                            s = s.substring(0, index - (k - 1)) + s.substring(index + 1);
                            break;
                        }
                        index++;
                    }
                } else {
                    alphabetStack.clear();
                    alphabetStack.push(s.charAt(index));
                    index++;
                }
            }
        }
        return s;
    }
}
