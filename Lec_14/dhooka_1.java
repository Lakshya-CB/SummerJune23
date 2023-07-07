package Lec_14;

public class dhooka_1 {
	public static void main(String[] args) {

		int n = 100_000;
		long start = System.currentTimeMillis();
		String str = "";
		StringBuilder sb = new StringBuilder();		
		int sum = 0;
		for (int i = 0; i < n; i++) {
//			str = str + i;
			sb.append(i);
		}
		long end = System.currentTimeMillis();
//		str = sb.toString();
		str = sb + "";
		System.out.println((end - start) / 1000.0);
	}
}
