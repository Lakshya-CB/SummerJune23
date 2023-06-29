package Lec_09;

public class Array_basic_recap {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 4, 30, 12, 14 };
//		disp(arr);
		Rev(arr);
		disp(arr);
//		System.out.println(find(arr, 40));

	}

	public static void disp(int[] arr) {
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.print(arr[idx]+" ");
		}
		System.out.println();
	}

	public static void disp2(int[] arr) {
		for (int ali : arr) {
			System.out.println(ali);
			ali = 99;
		}
	}

	public static int max(int[] arr) {
		int jeb = 0;
		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int find(int[] arr, int ali) {
		for (int idx = 0; idx < arr.length; idx++) {
			if (ali == arr[idx]) {
				return idx;
			}
		}
		return -1;
	}

	public static void Rev(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;

			s++;
			e--;
		}
	}

}
