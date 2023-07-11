package Lec_15;

public class Rec_basics_2 {
	public static void main(String[] args) {
//		PID(1, 5);
//		System.out.println(Fac(4));
		System.out.println(pow(2, 4));
	}

	public static void PID(int s, int e) {
		if (s > e) {
			return;
		}
//		BP : PID(s,e)
//		SP : PID(s+1,e)
		System.out.println(s);
		PID(s + 1, e);
		System.out.println(s);
	}
	public static int Fac(int n ) {
		if(n==0) {
			return 1;
		}
//		BP : Fac(n)
//		SP : Fac(n-1)
		int sp = Fac(n-1);
		return sp*n;
	}
	public static int pow(int a, int b) {
		if(b==0) {
			return 1;
		}
//		BP : a,b
//		SP : a,b-1
		int sp = pow(a, b-1);
		return sp*a;
	}
	
	public static int Fibo(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
//		BP : Fibo(n)
//		SP : Fibo(n-1) Fibo(n-2)
		int sp1 = Fibo(n-1);
		int sp2 = Fibo(n-2);
		return sp1+sp2;
	}
}
