package Lec_18;

import java.util.ArrayList;

public class plaindrome_parti2 {
	public static void main(String[] args) {
		chopchop("accbbcca", "", new ArrayList<String>());
	}

	public static void chopchop(String table, String bag, ArrayList<String> AL) {
		if (table.isEmpty()) {
			System.out.println(bag);
			System.out.println(AL);
			System.out.println("==============");
			return;
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
			String remain = table.substring(chakku);
			if (isPalin(piece)) {
				AL.add(piece);
				chopchop(remain, bag + "-" + piece, AL);
				AL.remove(AL.size() - 1);// Explicit back tracking!
			}
//			System.out.println(piece+ " - "+remain);
//			M1 => AL ko String ki tarah treat karo!!
//			ArrayList<String> AL_nn = new ArrayList<String>(AL);
//			AL_nn.add(piece);
//			chopchop(remain, bag + "-" + piece, AL_nn);
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
