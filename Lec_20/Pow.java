package Lec_20;

public class Pow {

	public static int pow(int a, int b) {
		if(b==0) {
			return 1;
		}
		int sp = pow(a, b / 2);
		if (b % 2 == 0) {
			return sp * sp;
		} else {

			return sp * sp * a;
		}
	}
}
