package cheoljin.leetcode;

public class DailyTemperature {
    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(T);
        for(int v : result) {
            System.out.print(v + " ");
        }
    }

    static int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            int count = 0;
            for (int j = i + 1; j < T.length; j++) {
                if(T[i] < T[j]) {
                    count = j-i;
                    break;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
