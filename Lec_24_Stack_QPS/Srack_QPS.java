package Lec_24_Stack_QPS;

import java.util.Stack;

public class Srack_QPS {
	public static void main(String[] args) {
//		Stack<Integer> S = new Stack<>();
//		S.add(10);
//		S.add(20);
//		S.add(30);
//		S.add(40);
//		printRec(S);
//		Reverse(S);
//		printRec(S);
		int[] arr = {50,30,20,40,10,45,5,60,15,8};
		nextGr8er(arr);
	}

	public static void print(Stack<Integer> S) {
//		40, 30, 20, 10
//		System.out.println(S);
		Stack<Integer> EX = new Stack<>();
		while (!S.isEmpty()) {
			System.out.println(S.peek());
			EX.add(S.pop());
		}
		while (!EX.isEmpty()) {
			S.add(EX.pop());
		}
	}

	public static void printRec(Stack<Integer> S) {
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		System.out.println(ali);
		printRec(S);
		S.add(ali);
	}

	public static void Copy(Stack<Integer> S, Stack<Integer> Ex) {
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		Copy(S, Ex);
		Ex.add(ali);
	}

	public static void Reverse(Stack<Integer> S) {
		Stack<Integer> Ex = new Stack<>();
		Copy(S, Ex);
		while (!Ex.isEmpty()) {
			S.add(Ex.pop());
		}
	}

	public static void nextGr8er(int[] arr) {

		Stack<Integer> S = new Stack<>();
		for(int B: arr) {
			while(!S.isEmpty()&&S.peek()<B) {
				int A = S.pop();
				System.out.println(A + " => "+B);
			}
			S.add(B);
		}
	}
}
