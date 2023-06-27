package Lec_07;

import java.util.Scanner;

public class char_input_lena {
public static void main(String[] args) {
	Scanner scn  = new Scanner(System.in);
//	char ch = scn.next().charAt(3);
	String word = scn.next();
	char ch = word.charAt(0);
	System.out.println(word+"=-=-=-"+ch + "=====");
}
}
