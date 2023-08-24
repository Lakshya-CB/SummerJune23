package Lec_DP;

import java.util.Scanner;

public class min_trails_needed2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		Integer[][][] dp = new Integer[300][300][300];
		while(t>0) {
			t--;
			int K = scn.nextInt();
			int N = scn.nextInt();
			System.out.println(solve(1, N, K,dp));
		}
	}

	public static int solve(int s, int e, int K,Integer[][][]dp) {
		if(s>e) {
			return 0;
		}
		if(K==1) {
			return e-s+1;
		}
		if(dp[s][e][K]!=null) {
			return dp[s][e][K];
		}
		int ans = Integer.MAX_VALUE;
		for (int i = s; i <= e; i++) {
//			1 2 3 4 5 6 7 ..e. N
//			N N N N N T T T T T T

//			c1 if tile tuti!!
			int c1 = solve(s, i - 1, K - 1,dp);
			
//			c2 if tile nahi tuti!!
			int c2 = solve(i + 1, e, K,dp);
			
			int curr = Math.max(c1, c2)+1;
			
//			System.out.println("("+s+","+e+")"+i + " - "+ K +"=>"+curr);
			ans = Math.min(ans, curr);
		}
		dp[s][e][K] = ans;
		return ans;
	}
}
