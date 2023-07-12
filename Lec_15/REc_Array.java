package Lec_15;

public class REc_Array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		print2(arr, arr.length - 1);
		print3(arr, 0, arr.length - 1);

	}

	public static void print(int[] arr, int s) {
		if (s == arr.length) {
			return;
		}
//		BP : print(arr,s)
//		SP : print(arr,s+1)
		System.out.println(arr[s]);
		print(arr, s + 1);

	}

	public static void print2(int[] arr, int e) {
//		BP : p(arr,4)
//		SP : p(arr,3)
		if (e < 0) {
			return;
		}
		print2(arr, e - 1);
		System.out.println(arr[e]);
	}

	public static void print3(int[] arr, int s, int e) {
		if (s > e) {
			return;
		}
		int mid = (s + e) / 2;
		print3(arr, s, mid - 1);
		System.out.println(arr[mid]);
		print3(arr, mid + 1, e);
	}

	public static int Max(int[] arr, int s) {
		if (s == arr.length - 1) {
			return arr[s];
		}
//		BP : Max(arr,0)
//		SP : Max(arr,1)
		int sp = Max(arr, s + 1);
		return Math.max(arr[s], sp);
	}

	public static int FirstOcc(int[] arr, int s, int ali) {
		if (s == arr.length) {
			return -1;
		}
		int sp = FirstOcc(arr, s + 1, ali);
		if (arr[s] == ali) {
			return s;
		}
		return sp;
	}

	public static int LastOcc(int[] arr, int s, int ali) {
		if (s == arr.length) {
			return -1;
		}
		int sp = LastOcc(arr, s + 1, ali);
		if (sp == -1 && arr[s] == ali) {
			return s;
		}
		return sp;
	}
}
