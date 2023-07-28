package Lec_25;

import java.util.Arrays;
import java.util.Stack;

public class Srack_QPS {
	public static void main(String[] args) {
		int[] arr = {50,30,20,40,10,45,5,60,15,8};
		nextGr8er2(arr);
	}


	public static void nextGr8er2(int[] arr) {

		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
//		for(int B: arr) {
		for(int idx =0;idx<arr.length;idx++) {
			int B = arr[idx];
			while(!S.isEmpty()&& arr[S.peek()]<B) {
				int A_idx = S.pop();
				ans[A_idx] = B;
				System.out.println(arr[A_idx] + " => "+B);
			}
			S.add(idx);
		}
		System.out.println(Arrays.toString(ans));
	}
}
