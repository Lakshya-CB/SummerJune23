package Lec_DP;

import java.util.*;

public class optimal_2 {

}

class Main {
	static int prefix_sum[];

	public static void main(String[] arraaaa) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		prefix_sum = new int[arr.length];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			sum = sum + arr[i];
			prefix_sum[i] = sum;
		}
		System.out.println(solve(true, 0, arr.length - 1, arr, new Integer[2][arr.length][arr.length]));
	}

	public static int solve(boolean turn, int s, int e, int[] arr, Integer[][][] dp) {
		if (s == e) {
			return arr[s];
		}
		if (turn) {
			if (dp[0][s][e] != null) {
				return dp[0][s][e];
			}
		} else {
			if (dp[1][s][e] != null) {
				return dp[1][s][e];
			}
		}
		int opponent_1 = solve(!turn, s + 1, e, arr, dp);
		int self_1 = arr[s] + Eff_sum(s + 1, e) - opponent_1;

		int opponent_2 = solve(!turn, s, e - 1, arr, dp);
		int self_2 = arr[e] + Eff_sum(s, e - 1) - opponent_2;
		if (turn) {
			dp[0][s][e] = Math.max(self_1, self_2);
		} else {
			dp[1][s][e] = Math.max(self_1, self_2);
		}
		return Math.max(self_1, self_2);

	}

	public static int Eff_sum(int s, int e) {
		int ans = prefix_sum[e];
		if (s > 0) {
			ans = ans - prefix_sum[s - 1];
		}
		return ans;
	}

	public static int sum(int[] arr, int s, int e) {
		int sum = 0;
		for (int i = s; i <= e; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}