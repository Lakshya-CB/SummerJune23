package Lec_04;

public class Pat_13 {
	public static void main(String[] args) {
		int n = 5;
		int tot_st = 1;
		int row = 1;
		while (row <= 2 * n - 1) {
			int cnt_st = 0;
			while (cnt_st < tot_st) {
				System.out.print("*");
				cnt_st++;
			}
			System.out.println();
			row++;
			if (row <= n) {
				tot_st++;
			} else {
				tot_st--;
			}
		}
	}
}
