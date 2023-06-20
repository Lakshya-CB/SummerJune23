package Lec_04;

public class Pat_034 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int tot_sp = n - 1;
		int tot_st = 1;
		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < tot_sp) {
				System.out.print(" ");
				cnt_sp++;
			}
			int cnt_st = 0;
			while (cnt_st < tot_st) {
				System.out.print("*");
				cnt_st++;
			}
			row++;
			tot_sp--;
			tot_st++;
			System.out.println();
		}

	}
}
