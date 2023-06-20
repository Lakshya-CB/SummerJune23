package Lec_04;

public class Pat_6 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_sp = n - 1;
		int total_st = 1;

		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print("* ");
				cnt_st++;
			}

			row++;
			total_sp = total_sp - 1;
			total_st = total_st + 2;
			System.out.println();
		}
	}
}
