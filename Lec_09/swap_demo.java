package Lec_09;

public class swap_demo {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4 };
		int[] a2 = { 23, 12, 14, 7 };
		System.out.println(a1[0] + +a2[0]);
		swap(a1[0], a2[0]);
//		swap(a1,a2);
//		swap(a1,a2, 0);
		System.out.println(a1[0] + +a2[0]);
	}
	public static void swap (int[] a, int[] b,int c){
		int d = a[c];
		a[c]=b[c];
		b[c] = d; 

	}

	public static void swap(int a, int b) {
		int c = a;
		a = b;
		b = c;
	}

	public static void swap(int[] arr1, int[] arr2) {
		int[] temp = arr1;
		arr1 = arr2;
		arr2 = temp;
	}

}
