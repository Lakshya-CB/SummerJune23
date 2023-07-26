package Lec_24;

import java.util.ArrayList;

public class Clinet {
	public static void main(String[] args) {
		Dynamic_Stack S = new Dynamic_Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		S.add(60);
		S.add(70);
		S.add(80);
		S.print();
//		System.out.println(S.ll(1,2,3,4,5,6,2));
		System.out.println(S);

		Object obj = new Dynamic_Stack();
		System.out.println(obj);

		ArrayList<Integer> AL = new ArrayList<>();
		System.out.println(AL);
	}

}
