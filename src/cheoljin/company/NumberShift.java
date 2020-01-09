package cheoljin.company;

public class NumberShift {
    public static void main(String[] args) {
        String s = "011100";
        int result = solution(s);
        System.out.println(result);
    }

    static int solution(String s) {
        int num = Integer.parseInt(s, 2);
        int count = 1;
        while(num!=0) {
            num = num>>1;
            if(num == 1) {
                count++;
            }
            count++;
        }
        return count;
    }
}
