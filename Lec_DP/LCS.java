package Lec_DP;

public class LCS {
	public int solve(String text1, int idx1, String text2, int idx2,Integer[][] dp) {
//		text1 => ch1
		if(idx1>=text1.length()||idx2>=text2.length()) {
			return 0;
		}
		if(dp[idx1][idx2]!=null) {
			return dp[idx1][idx2];
		}
		char ch1 = text1.charAt(idx1);
//		LCS mein nahi aaya ch1
		int sp1 = solve(text1, idx1+1, text2, idx2,dp);
//		LCS mein aye ga!
		int sp2 = 0;
		int f = text2.indexOf(ch1,idx2);
		if(f!=-1) {
			sp2 = 1+solve(text1, idx1+1, text2, f+1,dp);
		}
		dp[idx1][idx2] = Math.max(sp1,sp2);
		return Math.max(sp1,sp2);

	}

}
