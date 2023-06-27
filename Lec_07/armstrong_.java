package Lec_07;

public class armstrong_ {
	public static void main(String[] args) {
		int n = 10000;
		int num = 1;
		while (num <= n) {
			if (isArm(num)) {
				System.out.println(num);
			}
			num++;
		}
	}

	public static boolean isArm(int num) {
		int baaackup = num;
		int nod = numOfDigit(num);
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, nod);
			num = num / 10;
		}
		if (sum == baaackup) {
			return true;
		} else {
			return false;
		}
	}

	public static int numOfDigit(int num) {
		int ans = 0;
		while (num > 0) {
			num = num / 10;
			ans++;
		}
		return ans;
	}
}
