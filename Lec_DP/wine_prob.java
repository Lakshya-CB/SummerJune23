package Lec_DP;

public class wine_prob {

	public static void main(String[] args) {
		int[] wines = { 2, 3, 5, 1, 4 };
		System.out.println(beech(0, wines.length - 1, wines));
		System.out.println(BU(wines));
	}

	public static int beech(int s, int e, int[] daaru) {
		if (s > e) {
			return 0;
		}
		int bottles_sol = daaru.length - (e + 1 - s);
		int day = bottles_sol + 1;
		int sp1 = day * daaru[s] + beech(s + 1, e, daaru);
		int sp2 = day * daaru[e] + beech(s, e - 1, daaru);
		return Math.max(sp1, sp2);
	}

	public static int BU(int[] daaru) {
		int[][] dp = new int[daaru.length + 10][daaru.length + 10];
		for (int s = daaru.length - 1; s >= 0; s--) {
			for (int e = 0; e < daaru.length; e++) {
//				dp[s][e]!!
				if (s > e) {
//					dp[s][e]= 0;
					continue;
				}
				int bottles_sol = daaru.length - (e + 1 - s);
				int day = bottles_sol + 1;
				int sp1 = day * daaru[s] + dp[s + 1][e];
				int sp2 = day * daaru[e];
				if (e > 0) {
					sp2 = sp2 + dp[s][e - 1];
				}
				dp[s][e] = Math.max(sp1, sp2);
			}
		}
		return dp[0][daaru.length - 1];
	}

}
