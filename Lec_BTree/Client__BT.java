package Lec_BTree;

public class Client__BT {
	public static void main(String[] args) {
		int[] pre = {10,20,40,50,30,60};
		int[] in = {40,20,50,10,30,60};
		BTree BT = new BTree(pre, in);
//		BT.print();
		System.out.println(BT.size());
		System.out.println(BT.Dia());
	}
}
