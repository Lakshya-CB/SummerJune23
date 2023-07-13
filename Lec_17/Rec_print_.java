package Lec_17;

public class Rec_print_ {
	public static void main(String[] args) {
//		ClimbStiar(0, "", 4);
//		genPrent(2, 2, "");
		mazePath(0, 0, "", 2, 2);
	}

	public static void ClimbStiar(int curr, String path, int dest) {
		if (curr == dest) {// +ve BC
			System.out.println(path);
			return;
		}
		if (curr > dest) { // -ve BC
			return;
		}
		ClimbStiar(curr + 1, path + 1, dest);
		ClimbStiar(curr + 2, path + 2, dest);

	}

	public static void genPrent(int op, int cl, String path) {
		if (op == 0 && cl == 0) { // +ve BC
			System.out.println(path);
			return;
		}
		if (op > cl) { // -ve BC
			return;
		}
		if (op > 0) {
			genPrent(op - 1, cl, path + "(");
		}
		if (cl > 0) {
			genPrent(op, cl - 1, path + ")");
		}
	}

	public static void mazePath(int r, int c, String path, int dest_r, int dest_c) {
		if (r == dest_r && c == dest_c) {
			System.out.println(path);
			return;
		}
		if (r > dest_r || c > dest_c) {
			return;
		}
		mazePath(r, c + 1, path + "R", dest_r, dest_c);
		mazePath(r + 1, c, path + "D", dest_r, dest_c);
	}
}
