package Lec_25;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_demo {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
		print(Q);
		Revprint(Q,Q.size());
		print(Q);
//		System.out.println(Q);
//		System.out.println(Q.poll());
//		System.out.println(Q);
//		System.out.println(Q.poll());
//		System.out.println(Q);
//		System.out.println(Q.poll());
//		System.out.println(Q);
//		System.out.println(Q.poll());

	}

	public static void print(Queue<Integer> Q) {
		System.out.print("{ ");
		for(int i = 0;i<Q.size();i++) {
			System.out.print(Q.peek()+" ");
			Q.add(Q.poll());
		}
		System.out.println("}");
	}

	public static void Revprint(Queue<Integer> Q, int size) {
		if(size==0) {
			return;
		}
		int ali = Q.poll();
		Q.add(ali);
		Revprint(Q,size-1);
		System.out.println(ali);
		

	}
	public static void actualRev(Queue<Integer> Q) {

	}
		
}
