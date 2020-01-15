package cheoljin.company;

public class SumZeroList {
    public static void main(String[] args) {
        int[] result = solution(5);
        for (int v : result) {
            System.out.print(v + " ");
        }
    }

    static int[] solution(int N) {
        int[] arr = new int[N];
        if (N != 0) {
            int count = N / 2;
            int index = 0;
            int value = 0;
            if (N % 2 == 1) {
                arr[index++] = value;
            }
            for (int i = 0; i < count; i++) {
                arr[index++] = --value;
                arr[index++] = Math.abs(value);
            }
        } else {
            return arr;
        }
        return arr;
    }
}
