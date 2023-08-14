package Lec_DP;

public class Fibo_dp {

	public int fib(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = fib(n - 1);
		int sp2 = fib(n - 2);
		return sp1 + sp2;
	}

//	memoizatoin , Memorization, Top Down!
	public int fibTD(int n, Integer[] dp) {
		if (n <= 1) {
			return n;
		}
		if(dp[n]!=null) {
			return dp[n];
		}
		int sp1 = fibTD(n - 1, dp);
		int sp2 = fibTD(n - 2, dp);
		dp[n] = sp1 + sp2;
		return sp1 + sp2;
	}
}
