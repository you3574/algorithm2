package cheoljin.company.navercompetition;

public class OneBitCount {
    public static void main(String[] args) {
        int a = 7, b = 3; // 10101 -> 3
        System.out.println(solution(a, b));
    }

    static int solution(int A, int B) {
        return Integer.bitCount(A * B);
    }
}
