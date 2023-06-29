package Lec_09;

import java.util.Arrays;

public class Rotate {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(Arrays.toString(arr));
		karde2(arr, -27);
//		System.out.println(-27%5);
//		System.out.println(Arrays.toString(arr));

	}
	public static void karde2(int[] arr, int rot) {
		rot = rot %arr.length;
		if(rot<0) {
			rot = rot + arr.length;
		}
		Rev(arr, 0, arr.length-1);

		System.out.println(Arrays.toString(arr));
		Rev(arr, 0, rot-1);

		System.out.println(Arrays.toString(arr));
		Rev(arr,rot,arr.length-1);

		System.out.println(Arrays.toString(arr));
		
	}
	public static void Rev(int[] arr, int s, int e) {
//		int s = 0;
//		int e = arr.length - 1;
		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;

			s++;
			e--;
		}
	}
	public static void karde(int[] arr, int rot) {
		rot = rot % arr.length;
		for (int cnt = 1; cnt <= rot; cnt++) {
			int jeb = arr[arr.length - 1];
			for (int j = arr.length - 2; j >= 0; j--) {
				arr[j + 1] = arr[j];
			}
			arr[0] = jeb;
		}

	}
}
