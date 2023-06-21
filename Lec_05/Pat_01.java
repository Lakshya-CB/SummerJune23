package Lec_05;

public class Pat_01 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		while (row <= n) {
			int cnt_st = 0;
			while (cnt_st < n) {
//				if (row == 1|| row==n||cnt_st==0||cnt_st==n-1) {
				if (row == cnt_st + 1 || row + cnt_st == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cnt_st++;
			}
			System.out.println();
			row++;
		}
	}
}
