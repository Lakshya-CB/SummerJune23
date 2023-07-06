package Lec_12_13;

public class SOE {
	public static void main(String[] args) {
		int n = 25;
		boolean[] isComposite = new boolean[n+1];
		for(int div = 2; div*div<= n;div++) {
			if(isComposite[div]) {
				continue;
			}
			for(int table = div*div;table<=n;table = table +div) {
				isComposite[table] = true;
			}
		}
		for(int num = 2;num<=n;num++) {
			if(isComposite[num]==false) {
				System.out.println(num);
			}
		}
	}
}
