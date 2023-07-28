package Lec_25;

import java.util.Arrays;

public class max_num_K {
	static long ans = 0;

	public static void main(String[] args) {
		int[] arr = { 5, 4, 3, 1, 2, 7, 8, 9 };
		solve(arr, 3);
		System.out.println(ans);
	}

	public static void solve(int[] arr, int k) {
//		System.out.println(Arrays.toString(arr));
		String curr = "";
		for (int ali : arr) {
			curr = curr + ali;
		}
		ans = Math.max(ans, Long.parseLong(curr));

		if (k == 0) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				swap(i, j, arr);
				solve(arr, k - 1);
				swap(i, j, arr);
			}
		}
	}

	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
}
