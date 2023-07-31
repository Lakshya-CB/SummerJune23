package Lec_26;

import java.util.LinkedList;
import java.util.Queue;

public class First_Neg_Q {
	public static void main(String[] args) {
		int[] arr = { -20, 10, -5, 4, 6, -9, -80, 60, 50 };
		solve(arr, 3);

	}

	public static void solve(int[] arr, int k) {
		Queue<Integer> Q = new LinkedList<>();
		for (int idx = 0; idx < k; idx++) {
			if (arr[idx] < 0) {
				Q.add(idx);
			}
		}
		System.out.println(arr[Q.peek()]);
		for (int s = 1; s <= arr.length - k; s++) {
			if(!Q.isEmpty()&&Q.peek()==s-1) {
				Q.poll();
			}
			int e = s+k-1;
			if(arr[e]<0) {
				Q.add(e);
			}
			System.out.println(arr[Q.peek()]);
		}
	}
}
