package Lec_17;

public class plaindrome_parti {
	public static void main(String[] args) {
		chopchop("abcd", "");
	}

	public static void chopchop(String table, String bag) {
//		table = "nitin"
		if (table.isEmpty()) {
			System.out.println(bag);
			return;
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);

			String remain = table.substring(chakku);
//			System.out.println(piece+ " - "+remain);
			chopchop(remain, bag + "-" + piece);

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
