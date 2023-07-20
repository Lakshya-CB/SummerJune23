package Lec_20;

import java.util.Arrays;

public class sooooooooooooooorting {
	public static void main(String[] args) {
//		int[] arr1 = { 10, 20, 30, 40, 540 };
//		int[] arr2 = { 11, 12, 13, 14, 43, 100, 1000 };
//		System.out.println(Arrays.toString(merge(arr1, arr2)));
		int[] arr = {10,22,4,1};
		System.out.println(Arrays.toString(mergeSort(0, arr.length-1, arr)));
		
	}

	public static int[] merge(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int idx1 = 0;
		int idx2 = 0;
		int idx3 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] <= arr2[idx2]) {
				ans[idx3] = arr1[idx1];
				idx3++;
				idx1++;
			} else {
				ans[idx3] = arr2[idx2];
				idx3++;
				idx2++;
			}
		}
		while (idx1 < arr1.length) {
			ans[idx3] = arr1[idx1];
			idx3++;
			idx1++;
		}
		while (idx2 < arr2.length) {
			ans[idx3] = arr2[idx2];
			idx3++;
			idx2++;
		}
		return ans;
	}

	public static int[] mergeSort(int s, int e, int[] arr) {
		if(s==e) {
			int[] ans = new int[1];
			ans[0] = arr[s];
			return ans;
		}
		int mid = (s + e) / 2;
		int[] sp1 = mergeSort(s, mid, arr);
		int[] sp2 = mergeSort(mid + 1, e, arr);
		return merge(sp1,sp2);
	}
}
