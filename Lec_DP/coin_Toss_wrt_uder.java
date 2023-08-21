package Lec_DP;

public class coin_Toss_wrt_uder {
	public static void main(String[] args) {
		int Amount = 5;
		int[] coins = { 1, 2, 3 };
		System.out.println("ans=>" + solveTD(Amount, 0, coins, "", new Integer[Amount + 1][coins.length]));
	}

	public static int solveTD(int A, int prev, int[] coins, String path, Integer[][] dp) {
		if (A < 0) {
			return 0;
		}
		if (A == 0) {
			return 1;
		}
		if (dp[A][prev] != null) {
			return dp[A][prev];
		}
		int ans = 0;
		for (int i = prev; i < coins.length; i++) {
			ans = ans + solveTD(A - coins[i], i, coins, path, dp);
		}
		dp[A][prev] = ans;
		return ans;
	}

	public static int BU(int Amount, int[] coins) {
		int[][] dp = new int[Amount + 10][coins.length + 10];
		for (int A = 0; A <= Amount; A++) {
			for (int prev = coins.length - 1; prev >= 0; prev--) {
//				dp[A][prev]
				if (A == 0) {
					dp[A][prev]= 1;
					continue;
				}
				int ans = 0;
				for (int i = prev; i < coins.length; i++) {
					int sp = 0;
					if(A - coins[i]>=0) {
						sp = dp[A - coins[i]][i];
					}
					ans = ans + sp;
				}
				dp[A][prev] = ans;

			}
		}
		return dp[Amount][0];
	}
}
