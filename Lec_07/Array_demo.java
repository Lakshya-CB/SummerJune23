package Lec_07;

public class Array_demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);
//		indexing!! arr[i] ,0
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println(arr.length);
//		System.out.println(arr[5]);
//		System.out.println(arr[arr.length]);
//		System.out.println(arr[-1]);
		System.out.println("===========");
		for(int ali : arr) {
//			System.out.println(element);
//			ali = arr[idx];
			ali = 99;
			System.out.println(ali);
			
		}
		for(int ali : arr) {
			System.out.println(ali);
//			ali = 99;
			
		}
		
	}
}
