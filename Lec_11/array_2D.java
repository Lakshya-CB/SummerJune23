package Lec_11;

import java.util.Arrays;

public class array_2D {
	public static void main(String[] args) {
		int[][] arr = new int[3][4]; // [row][col]

//		arr[0] = null;
		System.out.println(arr);
		System.out.println(arr.length);

		for (int[] ali : arr) {
//			System.out.println(ali);
//			System.out.println(Arrays.toString(ali));
			for (int aloo : ali) {
				System.out.println(aloo);
			}
		}
		System.out.println(arr[0].length);
		int cnt = 1;
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				arr[r][c] = cnt;
				cnt++;
			}
		}
		for (int[] ali : arr) {
			System.out.println(Arrays.toString(ali));

		}

	}
}
