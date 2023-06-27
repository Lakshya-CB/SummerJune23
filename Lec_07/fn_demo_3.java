package Lec_07;

public class fn_demo_3 {
	static int val = 100;

	public static void main(String[] args) {
		System.out.println(fn_demo_3.val);
		fun(20);
		System.out.println(fn_demo_3.val);
	}

	public static void fun(int a) {
		int val = 20;
		System.out.println(val);
		System.out.println(fn_demo_3.val);
		val = val + 60;
		fn_demo_3.val = val + 10;
		System.out.println(val);
		System.out.println(fn_demo_3.val);
	}

}
