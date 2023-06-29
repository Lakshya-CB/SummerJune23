package Lec_09;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY_INPUT {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int idx =0;idx<arr.length;idx++) {
			arr[idx] = scn.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
