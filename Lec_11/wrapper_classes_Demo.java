package Lec_11;

public class wrapper_classes_Demo {
	public static void main(String[] args) {
		int i = 10;
		Integer I = 100;
		System.out.println(I+10+i);
		
		i = I;// unboxing!!
		I = i;// autoboxing!!
	}
}
