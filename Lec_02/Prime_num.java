package Lec_02;

public class Prime_num {
	public static void main(String[] args) {
		int num = 6;
		int div = 1;
		int nOfFac = 0;
		while (div <= num) {
			int rem = num % div;

			System.out.println(div + " - " + rem);
			if (rem == 0) {
				nOfFac = nOfFac + 1;
				div = div + 1;
			}
		}
		System.out.println(nOfFac);
	}
}
