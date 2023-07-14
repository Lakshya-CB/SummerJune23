package Lec_18;

public class N_Queens {
	public static void main(String[] args) {
		int n = 2;
		solveUs(0, 0, n, "", n, n, new boolean[n][n]);
	}

	public static void print(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean b : row) {
				if (b) {
					System.out.print("X");
				} else {
					System.out.print("-");
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

	private static boolean isSafe(boolean[][] board, int r, int c) {
		// TODO Auto-generated method stub
		return false;
	}
}
