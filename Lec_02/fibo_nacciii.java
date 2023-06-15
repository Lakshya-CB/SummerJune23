package Lec_02;

public class fibo_nacciii {
	public static void main(String[] args) {
		int n = 1;

		int a = 0;
		int b = 1;
		
		int cnt = 1;
		while (cnt <= n) {
			int c = a + b;
//		shifting !!
			a = b;
			b = c;

			cnt = cnt + 1;
		}
		System.out.println(a);
	}
}
