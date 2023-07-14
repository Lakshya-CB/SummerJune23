package Lec_18;

import java.util.Arrays;

public class Permutation {
	public static void main(String[] args) {
		int total_Seats = 3;

		perm(2, "", total_Seats, new boolean[total_Seats]);
		
	}

	public static void perm(int r, String path, int total_box, boolean[] picked) {
		if (r == 0) {
			System.out.println(path);
			System.out.println(Arrays.toString(picked));
			System.out.println("==========");
			return;
		}
		for (int curr = 0; curr < total_box; curr++) {
//			choose curr box!!
			if (picked[curr] == false) {
				picked[curr] = true;
				perm(r - 1, path + "b" + curr, total_box, picked);
				picked[curr] = false;
			}
		}

	}
}
