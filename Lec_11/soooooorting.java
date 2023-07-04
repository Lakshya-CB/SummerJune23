package Lec_11;

import java.util.Arrays;

public class soooooorting {
	public static void main(String[] args) {
		int[] arr = {50,40,30,20,10 };
		System.out.println(Arrays.toString(arr));
//		selection(arr);
		Insertion(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void selection(int[] arr) {
		for (int last = arr.length - 1; last >= 1; last--) {
			int max_idx = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[max_idx] < arr[i]) {
					max_idx = i;
				}
			}
			int temp = arr[max_idx];
			arr[max_idx] = arr[last];
			arr[last] = temp;
		}
	}

	public static void Insertion(int[] arr) {
//		 10,20,30,40,50,25
		for (int toIns = 1; toIns < arr.length; toIns++) {
			int idx = toIns - 1;
			int ali = arr[toIns];
			while (idx >= 0 && arr[idx] > ali) {
				arr[idx + 1] = arr[idx];
				idx--;
			}
			arr[idx + 1] = ali;
			System.out.println(Arrays.toString(arr));
		}
	}
}
