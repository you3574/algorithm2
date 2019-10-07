package cheoljin.leetcode;

public class LongPressedName {
    public static void main(String[] args) {
        String name1 = "alex";
        String typed1 = "aalex"; // true

        String name2 = "saeed";
        String typed2 = "ssaedd"; // false

        String name3 = "leelee";
        String typed3 = "lleeelee"; // true

        String name4 = "laiden";
        String typed4 = "laiden"; // true

        String name5 = "bhgyjhj";
        String typed5 = "bbhhggyyjhjj"; // true

        String name6 = "pyplrz";
        String typed6 = "ppyypllr"; // false

        System.out.println(solution(name1, typed1));
    }

    static boolean solution(String name, String typed) {
        char nameFirstStr;
        char typedFirstStr;
        if (name.equals(typed)) {
            return true;
        }
        while (!name.equals("") || !typed.equals("")) {
            if (name.length() == 0 || typed.length() == 0) {
                break;
            }
            nameFirstStr = name.charAt(0);
            typedFirstStr = typed.charAt(0);
            if (nameFirstStr != typedFirstStr) {
                return false;
            }
            String sliceName = "";
            String sliceTyped = "";
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == nameFirstStr) {
                    sliceName += nameFirstStr;
                } else {
                    break;
                }
            }
            for (int i = 0; i < typed.length(); i++) {
                if (typed.charAt(i) == typedFirstStr) {
                    sliceTyped += typedFirstStr;
                } else {
                    break;
                }
            }
            if (sliceName.length() > sliceTyped.length()) {
                return false;
            } else {
                name = name.substring(sliceName.length());
                typed = typed.substring(sliceTyped.length());
            }
        }

        if (name.length() == typed.length()) {
            return true;
        }
        return false;
    }
}
