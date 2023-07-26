package Lec_22_23;

public class CLient_stack {
	public static void main(String[] args) {
		Stack S = new Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
		S.add(60);
		
		S.print();
		System.out.println(S.pop());
		S.print();
		System.out.println(S.pop());
		S.print();
		System.out.println(S.pop());
		S.print();
		System.out.println(S.pop());
		
	}
}
