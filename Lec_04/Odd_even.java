package Lec_04;

import java.util.Scanner;

public class Odd_even {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();

		while (t > 0) {
			t--;

			int num = scn.nextInt();
			int sum_odd = 0;
			int sum_even = 0;

			while (num > 0) {
				int dig = num % 10;
				num = num / 10;
//			System.out.println(dig);
				if (dig % 2 == 0) {
					sum_even = sum_even + dig;
				} else {
					sum_odd = sum_odd + dig;
				}
			}
			if (sum_even % 4 == 0 || sum_odd % 3 == 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
