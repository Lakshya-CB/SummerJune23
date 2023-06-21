package Lec_05;

import java.util.Scanner;

public class Inc_dec {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();;
		
		int prev = Integer.MAX_VALUE;

		// 5 4 3 5 10 15 11
		int state = 0; // dec
		int ans = 1;
		while (n > 0) {
			n--;
			int curr = scn.nextInt();
			if (state == 0 && curr > prev) {
				state = 1;// transition => Inc state
			} else if (state == 1 && curr < prev) {
				ans = 0;
			}
			if (curr == prev) {
				ans = 0;
			}

			prev = curr;
		}
		if (ans == 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
