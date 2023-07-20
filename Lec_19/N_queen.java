package Lec_19;

public class N_queen {
	public static void main(String[] args) {
		int n = 4;
		solveUs(0, 0, n, "", n, n, new boolean[n][n]);
//		solveUs(0, 0, n, "", n, n);
	}

	public static void print(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean b : row) {
				if (b) {
					System.out.print("X ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}

	public static void solveUs(int r, int c, int TQP, String path, int total_row, int total_col, boolean[][] board) {

		if (TQP == 0) {
			System.out.println(path);
			print(board);
			System.out.println("=======");
			return;
		}
		if (c == total_col) {
			r++;
			c = 0;
		}
		if (r == total_row) {
			return;
		}
		if (isSafe(board, r, c)) {
			board[r][c] = true;
			solveUs(r, c + 1, TQP - 1, path + "{" + r + "," + c + "}", total_row, total_col, board);
			board[r][c] = false;
		}

		solveUs(r, c + 1, TQP, path, total_row, total_col, board);

	}

	private static boolean isSafe(boolean[][] board, int R, int C) {
		for (int c = 0; c <= C; c++) {
			if (board[R][c]) {
				return false;
			}
		}
		for (int r = 0; r <= R; r++) {
			if (board[r][C]) {
				return false;
			}
		}
		int r1 = R;
		int c1 = C; 
		while(r1>=0 && c1>=0) {
			if (board[r1][c1]) {
				return false;
			}
			r1--;c1--;
		}
		int r2 = R;
		int c2 = C; 
		while(r2>=0 && c2<board[0].length) {
			if (board[r2][c2]) {
				return false;
			}
			r2--;c2++;
		}
		return true;
	}
}
