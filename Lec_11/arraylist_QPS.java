package Lec_11;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist_QPS {
	public static void main(String[] args) {
		int[] arr1 = { 1, 0, 2, 3, 6 };
		int[] arr2 =    { 6, 7, 9, 9 };
		System.out.println(sum(arr1, arr2));
	}

	public static ArrayList<Integer> sum(int[] arr1, int[] arr2) {
		ArrayList<Integer> AL = new ArrayList<>();
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int carry = 0;
		while (idx1 >= 0 || idx2 >= 0) {
			int sum = carry;
			if (idx1 >= 0) {
				sum = sum + arr1[idx1];
			}
			if (idx2 >= 0) {
				sum = sum + arr2[idx2];
			}
			int digit = sum % 10;
//			System.out.println(digit);
			AL.add(digit);

			carry = sum / 10;
			idx1--;
			idx2--;
		}
		if (carry > 0) {
//			System.out.println(carry);
			AL.add(carry);

		}
		Collections.reverse(AL);
		return AL;
	}
}
