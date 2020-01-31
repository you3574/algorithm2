package cheoljin.company.navercompetition;

public class ReverseCoins {
    public static void main(String[] args) {
        int[] A1 = {1, 0, 1, 0, 1, 1}; // 1
        int[] A2 = {1, 1, 0, 1, 1}; // 2
        int[] A3 = {0, 1, 0}; // 0
        int[] A4 = {0, 1, 1, 0}; // 2

        int result = solution(A4);
        System.out.println(result);
    }

    static int solution(int[] A) {
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i - 1]) {
                if (A[i] == 0) {
                    A[i] = 1;
                } else {
                    A[i] = 0;
                }
                count++;
            }
        }
        if (A.length / 2 < count) {
            count = A.length - count;
        }
        return count;
    }
}
