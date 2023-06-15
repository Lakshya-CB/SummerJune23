package lec_01;

import java.util.Scanner;

public class report_card {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int marks = scn.nextInt();
		if (marks >= 90) {
			System.out.println("A");
		} else if (60 > marks && marks >= 50) {
			System.out.println("E");
		} else if (80 > marks && marks >= 70) {
			System.out.println("C");
		} else if (70 > marks && marks >= 60) {
			System.out.println("D");
		} else if (90 > marks && marks >= 80) {
			System.out.println("B");
		} else {
			System.out.println("F");
		}

	}
}
