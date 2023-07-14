package Lec_18;

public class combination {
	public static void main(String[] args) {
//		solvePT(2, -1, "", 3);
		solveUs(0, 2, "", 3);
	}

	public static void solvePT(int r, int last, String path, int total) {
		if (r == 0) {
			System.out.println(path);
			return;
		}
		for (int curr = last + 1; curr < total; curr++) {
//			curr seat choose
			solvePT(r - 1, curr, path + "b" + curr, total);
		}
	}

		public static void solveUs(int curr, int r, String path, int total) {
			
			if(r==0) {
				System.out.println(path);
				return;
			}
			if(curr==total) {
				return;
			}
			
			solveUs(curr+1, r-1, path+"b"+curr, total);
			solveUs(curr+1, r, path, total);
			
		}
}
