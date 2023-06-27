package Lec_07;

public class rotate_num {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 4;

		int baackup = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = baackup;
		
		rot = rot %nod;
		for (int count = 1; count <= rot; count++) {
			int dig = num % 10; // 5
			int part = num / 10;// 1234

			num = part + dig * (int) Math.pow(10, nod - 1);
			System.out.println(num);
			
		}
	}
}
