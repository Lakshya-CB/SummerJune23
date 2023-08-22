package Lec_DP;

public class Fibo_dp {
public static void main(String[] args) {
	System.out.println(fib(10));
	System.out.println(BUSE(10));
}
	public static int fib(int n) {
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
//	BU
	public int BU(int Nth) {
		int[] dp =new int[Nth+1];
		for(int n = 0;n<=Nth;n++) {
			if (n <= 1) {
				dp[n]= n;
				continue;
			}
			int sp1 = dp[n-1];
			int sp2 = dp[n-2];
			
			dp[n] = sp1+sp2;
		}
		return dp[Nth];
	}
	public static int BUSE(int Nth) {
//		int[] dp =new int[Nth+1];
		int curr = 0;
		int p1 = 0;
		int p2 = 0;
		
		for(int n = 0;n<=Nth;n++) {
			if (n <= 1) {
				curr = n;
				p2 = p1;
				p1 = curr;
						
				continue;
			}
			int sp1 = p1;
			int sp2 = p2;
			
			curr = sp1+sp2;
			p2 = p1;
			p1 = curr;
		}
		return curr;
	}
}
