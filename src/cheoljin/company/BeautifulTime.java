package cheoljin.company;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class BeautifulTime {
    public static void main(String[] args) {
        String s1 = "15:15:00";
        String t1 = "15:15:12";
        int result1 = solution(s1, t1);
        System.out.println(result1);

        String s2 = "22:22:21";
        String t2 = "22:22:23";
        int result2 = solution(s2, t2);
        System.out.println(result2);
    }

    static int solution(String S, String T) {
        LocalTime s = LocalTime.parse(S);
        LocalTime t = LocalTime.parse(T);
        int result = 0;

        while (true) {
            if(s.compareTo(t) == 1) {
                break;
            }
            Set<Character> numberSet = new HashSet<>();
            int hour = s.getHour();
            int minute = s.getMinute();
            int second = s.getSecond();
            boolean equalsMinute = minute == t.getMinute();
            if (hour < 10) {
                numberSet.add('0');
            } else {
                String sliceHour = String.valueOf(hour);
                numberSet.add(sliceHour.charAt(0));
                numberSet.add(sliceHour.charAt(1));
            }
            if (minute < 10) {
                numberSet.add('0');
            } else {
                String sliceMinute = String.valueOf(minute);
                numberSet.add(sliceMinute.charAt(0));
                numberSet.add(sliceMinute.charAt(1));
            }
            if(numberSet.size() > 2 && !equalsMinute) {
                s = s.plusSeconds(60-s.getSecond());
            } else {
                if (second < 10) {
                    numberSet.add('0');
                } else {
                    String sliceSecond = String.valueOf(second);
                    numberSet.add(sliceSecond.charAt(0));
                    numberSet.add(sliceSecond.charAt(1));
                }
                s = s.plusSeconds(1);
            }
            if (numberSet.size() < 3) {
                result++;
            }
        }
        return result;
    }
}
