package Lec_07;

public class array_qps_1 {
	public static void main(String[] args) {
		int n = 10;
		int[] arr = new int[n];
		int table = 2;
		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = table;
			table = table + 2;
//			System.out.println(arr[idx]);
		}
//		System.out.println(arr);
//		for (int idx = 0; idx < arr.length; idx++) {
//			System.out.println(arr[idx]); 
//		}
		
		
	}
}
