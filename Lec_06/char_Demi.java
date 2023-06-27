package Lec_06;

public class char_Demi {
	public static void main(String[] args) {
		char ch = 'a';
		System.out.println((int)ch);
		System.out.println((int)'b');
		System.out.println((int)'^');
		ch = '4';
		System.out.println(ch);
		
		if(ch>='A'&& ch <='Z') {
			System.out.println("Upper");
		}else if(ch >='a' && ch <='z') {
			System.out.println("Low");
		}else {
			System.out.println("envaliiid");
		}
		
		
	}
}
