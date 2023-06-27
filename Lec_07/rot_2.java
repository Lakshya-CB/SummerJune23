package Lec_07;

public class rot_2 {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 23;

		int baackup = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = baackup;

		rot = rot % nod;
//	///////////////
		int div = (int) Math.pow(10, rot);

		int p1 = num / div;
		int p2 = num % div;
//		System.out.println(p1+" - "+p2);
//		System.out.println(p2+""+p1);
		int ans = p2 * (int) Math.pow(10, nod - rot) + p1;
		System.out.println(ans);
	}
}
