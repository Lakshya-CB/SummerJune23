package Lec_20_21;

import java.util.Arrays;

public class Quick_sort {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 80, 90, 70, 10, 30, 60, 120 };
		quick(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quick(int[] arr, int s, int e) {
		if (s >= e) {
			return;
		}
		int pivot = arr[(s + e) / 2];
		int L = s;
		int R = e;
		while (L <= R) {
//			[50,40,80,90,70, 10,30,60,120]
//			identify left problem!!
			while (arr[L] < pivot) {
				L++;
			}
			while (arr[R] > pivot) {
				R--;
			}
			if (L <= R) {
				int temp = arr[L];
				arr[L] = arr[R];
				arr[R] = temp;
				L++;
				R--;
			}
		}
		quick(arr, s, R); // (0,-1)
		quick(arr, L, e);// (1,0)

	}
}
