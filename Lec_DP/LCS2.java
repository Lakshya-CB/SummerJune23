package Lec_DP;

public class LCS2 {
	public int solve(String text1, int idx1, String text2, int idx2, Integer[][] dp) {
		if(idx1>=text1.length() || idx2>=text2.length()) {
			return 0;
		}
		if(dp[idx1][idx2]!=null) {
			return dp[idx1][idx2];
		}
		if (text1.charAt(idx1) == text2.charAt(idx2)) {
			 int ans = 1 + solve(text1, idx1 + 1, text2, idx2 + 1, dp);
			 dp[idx1][idx2]= ans;
			 return ans;
		} else {
			int sp1 = solve(text1, idx1 + 1, text2, idx2, dp);
			int sp2 = solve(text1, idx1, text2, idx2+1, dp);
			dp[idx1][idx2]= Math.max(sp1, sp2);
			return Math.max(sp1, sp2);
		}
	}

}
