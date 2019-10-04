package cheoljin.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        /*
          "((()))",
          "(()())",
          "(())()",
          "()(())",
          "()()()"
        */
        List<String> result = solution(n);
        for (String v : result) {
            System.out.println(v);
        }
    }

    static List<String> result;
    static int length;

    static List<String> solution(int n) {
        result = new ArrayList<>();
        String parentheses = "";
        length = 2 * n;
        int open = n;
        int close = n;
        makeParentheses(parentheses, open, close);
        return result;
    }

    static void makeParentheses(String parentheses, int open, int close) {
        if (parentheses.length() == length) {
            result.add(parentheses);
        } else {
            if (open == close) {
                parentheses += "(";
                makeParentheses(parentheses, open - 1, close);
            } else {
                if (open == 0) {
                    parentheses += ")";
                    makeParentheses(parentheses, open, close - 1);
                } else if (close == 0) {
                    parentheses += "(";
                    makeParentheses(parentheses, open - 1, close);
                } else {
                    parentheses += "(";
                    makeParentheses(parentheses, open - 1, close);
                    parentheses = parentheses.substring(0, parentheses.length() - 1);
                    parentheses += ")";
                    makeParentheses(parentheses, open, close - 1);
                }
            }
        }
    }
}