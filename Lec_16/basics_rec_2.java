package Lec_16;

import Lec_08.subarray_1;

public class basics_rec_2 {
	public static void main(String[] args) {
//		CT(2, "");
		Subseq("abc", "");
	}

	public static void CT(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return;
		}
		CT(n - 1, path + "H");
		CT(n - 1, path + "T");
	}

	public static void Subseq(String str, String team) {
		if (str.isEmpty()) {
			System.out.println("^" + team + "^");
			return;
		}
//		str = "abcd"
//		str = "bcd"
		char ch = str.charAt(0);
		String remain = str.substring(1);
		Subseq(remain, team + ch);
		Subseq(remain, team);
	}

	public static void LKC(String buttons, String ans) {
		if(buttons.isEmpty()) {
			System.out.println(ans);
			return;
		}
//		buttons = "253";
//		remain = "53"
		String remain = buttons.substring(1);
		char ch = buttons.charAt(0);
		String ops = options(ch);// abc
		for(int i=0;i<buttons.length();i++) {
			LKC(remain, ans+ops.charAt(i));
		}

	}

	public static String options(char ch) {
		String arr[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		return arr[ch-'0'];
	}
}
