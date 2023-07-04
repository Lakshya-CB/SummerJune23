package Lec_10;

public class Intersection {
	public static void main(String[] args) {
		int[] arr1 = { 5, 7, 10, 10, 10, 20, 30, 30, 50, 60, 60, 80 };
		int[] arr2 = { 10, 10, 15, 20, 30, 30, 30, 60, 70, 80, 80, 90 };
		solve(arr1, arr2);

	}
	public static void solve(int[]arr1 , int[] arr2) {
		int idx1 =0;
		int idx2=0;
		while(idx1<arr1.length && idx2<arr2.length) {
			if(arr1[idx1]<arr2[idx2]) {
				idx1++;
			}else if(arr1[idx1]>arr2[idx2]) {
				idx2++;
			}else {
				System.out.println(arr1[idx1]);
				idx1++;idx2++;
			}
		}
	}
}
