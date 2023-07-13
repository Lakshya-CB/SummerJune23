package Lec_17;

import java.util.ArrayList;

public class plaindrome_parti2 {
	public static void main(String[] args) {
		chopchop("abcd", "", new ArrayList<String>());
	}

	public static void chopchop(String table, String bag,
			
			ArrayList<String> AL) {
		if (table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL);
			System.out.println("==============");
			return;
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);

			String remain = table.substring(chakku);
//			System.out.println(piece+ " - "+remain);
			AL.add(piece);
			chopchop(remain, bag + "-" + piece,AL);
		}
	}

	public static boolean isPalin(String str) {
		int s = 0;
		int e = str.length() - 1;
		while (s < e) {
			if (str.charAt(s) != str.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
}
