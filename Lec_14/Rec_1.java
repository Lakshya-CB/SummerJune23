package Lec_14;

public class Rec_1 {
	public static void main(String[] args) {
//		PD(5);
		PI(5);
	}

	public static void PD(int n) {
		if(n==0) {
			return;
		}
//	BP : PD(n)
//	SP : PD(n-1)
		System.out.println(n);
		PD(n - 1);
	}
	
	public static void PI(int n ) {
		if(n==0) {
			return;
		}
//		BP :PI(n) 
//		SP :PI(n-1)
		PI(n-1);
		System.out.println(n);
	}
	public static void PDI(int n ) {
		if(n==0) {
			return;
		}
//		BP : PDI(n)
//		SP : PDI(n-1)
		System.out.println(n);
		PDI(n-1);
		System.out.println(n);
	}
}
