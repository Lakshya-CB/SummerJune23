package Lec_11;

import java.util.ArrayList;

public class arraylist_demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();

		System.out.println(AL);
		AL.add(10);
		AL.add(20);
		AL.add(30);
		AL.add(40);
		System.out.println(AL);
		System.out.println(AL.get(0));
		System.out.println(AL.size());
		System.out.println(AL.get(AL.size() - 1));

		// update!! at index i!!

		AL.set(0, null);
		System.out.println(AL);
		AL.add(2, 25);
		System.out.println(AL);
		AL.add(AL.size(), 205);

		System.out.println(AL);
		AL.remove(0);
		System.out.println(AL);
		
	}

}
