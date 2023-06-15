package Lec_03;

import java.util.Scanner;

public class shopping_game {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {
			T--;
	
			int A_max = scn.nextInt()	;
			int A_curr = 0;

			int H_max = scn.nextInt();
			int H_curr = 0;
			int phone = 1;
			while (true) {
				A_curr = A_curr + phone;
				phone++;
				if (A_curr > A_max) {
					System.out.println("Harshit");
					break;
				}
				H_curr = H_curr + phone;
				phone++;
				if (H_curr > H_max) {
					System.out.println("Aayush");
					break;
				}
			}
		}
	}
}
