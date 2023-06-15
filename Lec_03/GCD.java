package Lec_03;

public class GCD {
	public static void main(String[] args) {
		int n1 = 38;
		int n2 = 42;
		int divisor = n1;
		int dividend = n2;
		while (divisor>0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(dividend);
	}
}
