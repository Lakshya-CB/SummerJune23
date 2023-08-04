package Lec_30;

import java.util.Scanner;

public class Vivek {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {
			T--;

			int[] arr = new int[scn.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			System.out.println(solve(arr, 0, arr.length - 1));
		}
	}

	public static int solve(int[] arr, int s, int e) {
		for (int chakku = s + 1; chakku <= e; chakku++) {
			if (sum(arr, s, chakku - 1) == sum(arr, chakku, e)) {
				int L = solve(arr, s, chakku - 1);
				int R = solve(arr, chakku, e);
				return Math.max(L, R) + 1;
			}
		}
		return 0;
	}

	private static long sum(int[] arr, int s, int e) {
		long ans = 0;
		for (int i = s; i <= e; i++) {
			ans = ans + arr[i];
		}
		return ans;
	}

	public boolean predictTheWinner(int[] nums) {
		return solve(0, nums.length-1, true, 0, 0, nums);
	}

	public boolean solve(int s, int e, boolean TurnA, int Sk_A, int Sk_B, int[] arr) {
		if (s > e) {
			if (Sk_A >= Sk_B) {
				return true;
			} else {
				return false;
			}
		}

		if (TurnA) {
			boolean sp1 = solve(s + 1, e, false, Sk_A + arr[s], Sk_B, arr);
			boolean sp2 = solve(s, e - 1, false, Sk_A + arr[e], Sk_B, arr);
			return sp1 || sp2;
		} else {
			boolean sp1 = solve(s + 1, e, true, Sk_A, Sk_B + arr[s], arr);
			boolean sp2 = solve(s, e - 1, true, Sk_A, Sk_B + arr[e], arr);
			return sp1 && sp2;
		}
	}

}
