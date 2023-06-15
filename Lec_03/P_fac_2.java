package Lec_03;

public class P_fac_2 {
	public static void main(String[] args) {
		int div = 2;
		int num = 12;
		int prev_div = 1;
		while (num > 1) {
			if (num % div == 0) {
//			div is a factor!!
				if (div != prev_div) {
					System.out.print(div + " ");
				}
				prev_div = div;
				num = num / div;
			} else {
				div = div + 1;
			}
		}

	}
}
