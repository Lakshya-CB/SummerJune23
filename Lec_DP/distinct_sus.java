package Lec_DP;

import java.util.Scanner;

public class distinct_sus {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			t--;
			int ans = count(scn.next(), 0);
			if(ans<0) {
				ans = 1000000007+ans;
			}
			System.out.println(ans);
		}
	}
	public static int count(String str, int s) {
		if (s == str.length()) {
			return 1;
		}
		char ch = str.charAt(s);
		int sp = count(str, s + 1)%1000000007 ;

		int f = str.indexOf(ch, s + 1);
		if (f == -1) {
			return 2 * sp;
		} else {
			int repeating_ss = count(str, f + 1)%1000000007 ;
			return (2 * sp - repeating_ss)%1000000007 ;
		}

	}
}
