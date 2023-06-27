package Lec_08;

public class subarray_1 {
	public static void main(String[] args) {
		int[] arr = { -10, -20, -1, -2, -30, -40 };
		sum2(arr);
	}

	public static void sum1(int[] arr) {
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s+" - "+e);
				int sum = 0;// C
				for (int idx = s; idx <= e; idx++) {
					System.out.print(arr[idx] + " ");
					sum = sum + arr[idx];
				}
				System.out.println("=>" + sum); // A
			}
		}
	}

	public static void sum2(int[] arr) {
//		int sum = 0;//A
		for (int s = 0; s < arr.length; s++) {
			int sum = 0;// B
			for (int e = s; e < arr.length; e++) {

				sum = sum + arr[e];
				System.out.println("=>" + sum); // A
			}
		}
	}

	public static int Kadace(int[] arr) {
		int sum = 0;
		int ans = Integer.MIN_VALUE;
		for (int ali : arr) {
			sum = sum + ali;
			if (ans < sum) {
				ans = sum;
			}
			if (sum < 0) {
				sum = 0;
			}
			
		}
		return ans;
	}
}
