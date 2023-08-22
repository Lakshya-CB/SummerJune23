package Lec_DP;

public class coin_Toss_coin {
	public static void main(String[] args) {
		int Amount = 50;
		int[] coins = { 1, 2, 3, };
		System.out.println("ans=>" + solveTD(Amount, 0, coins, "", new Integer[Amount + 1][coins.length]));
		System.out.println(BUSE(Amount, coins));
	}

	public static int solveTD(int A, int idx, int[] coins, String path, Integer[][] dp) {
		if (A == 0) {
//			System.out.println(path);
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		if (dp[A][idx] != null) {
			return dp[A][idx];
		}
		int sp1 = solveTD(A - coins[idx], idx, coins, path, dp);
		int sp2 = solveTD(A, idx + 1, coins, path, dp);
		dp[A][idx] = sp1 + sp2;
		return sp1 + sp2;
	}

	public int BU(int Amount, int[] coins) {
		int[][] dp = new int[Amount + 1][coins.length + 1];

		for (int idx = coins.length - 1; idx >= 0; idx--) {
			for (int A = 0; A <= Amount; A++) {
//				dp[A][idx]!!
				if (A == 0) {
					dp[A][idx] = 1;
					continue;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[A - coins[idx]][idx];
				}
				int sp2 = dp[A][idx + 1];
				dp[A][idx] = sp1 + sp2;
			}
		}
		return dp[Amount][0];
	}
	public static int BUSE(int Amount, int[] coins) {
		int[] dp_curr = new int[Amount + 1];
		int[] dp_prev = new int[Amount + 1]; //idx+1;

		for (int idx = coins.length - 1; idx >= 0; idx--) {
			for (int A = 0; A <= Amount; A++) {
//				dp[A][idx]!!
				if (A == 0) {
					dp_curr[A]= 1;
					continue;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp_curr[A - coins[idx]];
				}
				int sp2 = dp_prev[A];
				dp_curr[A] = sp1 + sp2;
			}
			dp_prev = dp_curr;
			dp_curr = new int[Amount + 1];
			
		}
		return dp_prev[Amount];
	}

}
