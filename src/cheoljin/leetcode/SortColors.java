package cheoljin.leetcode;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int zero_count = 0;
        int one_count = 0;
        int two_count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero_count++;
            } else if (nums[i] == 1) {
                one_count++;
            } else {
                two_count++;
            }
        }
        int start_index = 0;
        for (int i = 0; i < zero_count; i++) {
            nums[i] = 0;
        }
        start_index = zero_count;
        for (int i = start_index; i < start_index + one_count; i++) {
            nums[i] = 1;
        }
        start_index = zero_count + one_count;
        for (int i = start_index; i < nums.length; i++) {
            nums[i] = 2;
        }
        System.out.print("[");
        for(int i = 0; i<nums.length; i++) {
            if(i == nums.length-1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i]+",");
            }
        }
        System.out.print("]");
    }
}
