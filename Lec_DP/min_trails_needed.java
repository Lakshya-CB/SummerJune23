package Lec_DP;

import java.util.Scanner;

public class min_trails_needed {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		Integer[][] dp = new Integer[1005][1005];
		while(t>0) {
			t--;
			int K = scn.nextInt();
			int N = scn.nextInt();
			System.out.println(solve( N, K,dp));
		}
	}

	public static int solve(int len, int K,Integer[][]dp) {
		if(len<=0) {
			return 0;
		}
		if(K==1) {
			return len;
		}
		if(dp[len][K]!=null) {
			return dp[len][K];
		}
		
		int ans = Integer.MAX_VALUE;
		for (int i = 1; i <= len; i++) {
//			1 2 3 4 5 6 7 ..e. N
//			N N N N N T T T T T T

//			c1 if tile tuti!!
			int c1 = solve(i-1, K - 1,dp);
			
//			c2 if tile nahi tuti!!
			int c2 = solve(len-i, K,dp);
			
			int curr = Math.max(c1, c2)+1;
//			System.out.println("("+s+","+e+")"+i + " - "+ K +"=>"+curr);

			ans = Math.min(ans, curr);
		}
		dp[len][K] = ans;
		return ans;
	}
}
