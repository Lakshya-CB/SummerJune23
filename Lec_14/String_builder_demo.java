package Lec_14;

public class String_builder_demo {
	public static void main(String[] args) {
		String str = "abacada";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.lastIndexOf("a"));
		System.out.println(sb.length());
		sb.setCharAt(2, '^'); //O(1)
		System.out.println(sb);
//		sb.append("jaadu matnar kardo sare!");
		sb.insert(1, "??");

		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
	}
}
