package Lec_14;

public class str_demo {
	public static void main(String[] args) {
		String str = new String("abcd");
		String str1 = str.intern();
		String str2 = "abcd";
		System.out.println(str==str1);
		System.out.println(str1==str2);
		System.out.println(str.substring(0));
	}
}
