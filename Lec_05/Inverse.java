package Lec_05;

public class Inverse {
	public static void main(String[] args) {
		int n = 23154;
		int pos = 1;
		int sum = 0;
		while (n > 0) {
			int dig = n % 10;
			System.out.println(dig + " - " + pos);
			int mult = (int) Math.pow(10, dig - 1);
			System.out.println(pos * mult);
			
			sum = sum + pos * mult;

			n = n / 10;
			pos = pos + 1;
		}
		System.out.println(sum);
	}
}
