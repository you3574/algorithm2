package yoobin.leetcode;

public class LongPressedName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		System.out.println(isLongPressedName(name1, typed1));
	}

	public static boolean isLongPressedName(String name, String typed) {

		int j=0;
		int[] name1 = new int[name.length()];
		int[] typed1 = new int[typed.length()];
		for (int i = 0; i < name1.length; i++) {
			name1[i] = name.charAt(i);
		}
		for (int i = 0; i < typed.length(); i++) {
			typed1[i] = typed.charAt(i);
		}

		if (name.contains(typed)) {
			return true;
		} // 다 맞을때

		if (name1[0] != typed1[0]) {
			return false;
		} // 첫 문자 틀릴때

		for (int i = 0; i < name.length(); i++) { 
			while(j<typed.length())
				if (name1[i] == typed1[j]) {
					
				} else

					break;
			}
		

		return true;

	}

}
