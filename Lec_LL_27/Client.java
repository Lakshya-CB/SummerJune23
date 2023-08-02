package Lec_LL_27;

public class Client {
	public static void main(String[] args) {
		LinkedList LL = new LinkedList();
//		LL.addLast(10);
//		LL.addLast(20);
//		LL.addLast(30);
//		LL.addLast(40);
//		LL.addLast(50);
////		LL.addAt(2, 25);
//		LL.disp();
////		LL.removeAt(2);
////		LL.Reverse();
//		LL.Rev2();
//		LL.disp();
//		
		for(int i=1;i<=9;i++) {
			LL.addLast(i);
		}
		LL.disp();
		LL.K_Rev(3);
		LL.disp();
	}
}
