package Lec_03;

public class DO_table_1 {
	public static void main(String[] args) {
		int n1 = 2;

		int limit = 10;
		int i = 1;
		while (n1 * i <= limit) {
			int ans = n1 * i;
			System.out.println(ans);
			i++;
		}
	}
}
