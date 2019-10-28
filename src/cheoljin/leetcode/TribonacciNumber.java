package cheoljin.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TribonacciNumber {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(solution(n));
//        System.out.println(solution1(n));
//        System.out.println(solution2(n));
    }

    // Bad Solution
    static int solution(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return solution(n - 3) + solution(n - 2) + solution(n - 1);
        }
    }

    // Bottom-up
    static int solution1(int n) {
        List<Integer> tribonacci = new ArrayList<>();
        tribonacci.add(0);
        tribonacci.add(1);
        tribonacci.add(1);
        if (n <= 2) {
            return tribonacci.get(n);
        } else {
            for (int i = 3; i <= n; i++) {
                tribonacci.add(tribonacci.get(i - 3) + tribonacci.get(i - 2) + tribonacci.get(i - 1));
            }
            return tribonacci.get(n);
        }
    }

    // Memoization
    static int solution2(int n) {
        tribonacci_cache = new HashMap<>();
        tribonacci_cache.put(0, 0);
        tribonacci_cache.put(1, 1);
        tribonacci_cache.put(2, 1);
        return makeTribonacci(n);
    }

    static int makeTribonacci(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return tribonacci_cache.get(n);
        } else if (tribonacci_cache.containsKey(n)) {
            return tribonacci_cache.get(n);
        } else {
            tribonacci_cache.put(n, makeTribonacci(n - 3) + makeTribonacci(n - 2) + makeTribonacci(n - 1));
            return tribonacci_cache.get(n);
        }
    }

    static Map<Integer, Integer> tribonacci_cache;
}
