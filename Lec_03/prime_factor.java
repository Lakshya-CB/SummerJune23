package Lec_03;

public class prime_factor {
	public static void main(String[] args) {
		int div = 2;
		int num = 12;
		while (num>1) {
			if(num%div==0) {
//				div is a factor!!
				System.out.print(div+" ");
				num = num/div;
			}else {
				div =div +1;
			}
		}
	}
}
