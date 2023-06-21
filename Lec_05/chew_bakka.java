package Lec_05;

public class chew_bakka {
	public static void main(String[] args) {
		long n = 999;
		long mult = 1;
		long sum = 0;
		while (n > 0) {
			long dig = n % 10;
			if (n != 9 && dig >= 5) {
				dig = 9 - dig;
			}
			sum = dig * mult + sum;
			mult = mult * 10;
			n = n / 10;
		}
		System.out.println(sum);
	}
}
