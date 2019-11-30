package cheoljin.leetcode;

public class ArrayNesting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 0, 3, 1, 6, 2};
        System.out.println(arrayNesting(arr));
    }

    static int arrayNesting(int[] nums) {
        boolean[] check = new boolean[nums.length];
        int max_count = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int next_index = nums[i];
            int count = 1;
            if (!check[i]) {
                check[i] = true;
                while (!check[next_index]) {
                    count++;
                    check[next_index] = true;
                    next_index = nums[next_index];
                }
                max_count = Math.max(max_count, count);
            }
        }
        return max_count;
    }
}
