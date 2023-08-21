package Lec_DP;

import java.util.HashMap;

public class coin_exchnage {
	public static void main(String[] args) {

	}

	public static int profit(int n,HashMap<Integer,Integer> HM) {
		if(n==0) {
			return n;
		}
		if(HM.containsKey(n)) {
			return HM.get(n);
		}
		int sp1 = profit(n/2,HM);
		int sp2 = profit(n/3,HM);
		int sp3 = profit(n/4,HM);
		HM.put(n, Math.max(n, sp1+sp2+sp3));
		return Math.max(n, sp1+sp2+sp3);
	}
}
