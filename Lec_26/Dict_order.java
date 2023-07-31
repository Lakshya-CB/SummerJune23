package Lec_26;

public class Dict_order {
	public static void main(String[] args) {
		String str = "abcbda";
		int[] batua = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			batua[ch - 'a']++;
		}
		rearrange(batua, "");

	}

	public static void rearrange(int[] batua, String path) {
		System.out.println(path);
		for (int i = 0; i < batua.length; i++) {
			char ch = (char) ('a' + i);
			if (batua[i] > 0) {
				batua[i]--;
				rearrange(batua, path + ch);
				batua[i]++;
			}
		}
	}
}
