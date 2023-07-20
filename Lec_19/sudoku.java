package Lec_19;

public class sudoku {
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
		solve(0, 0, board);
		print(board);

	}

	public static void print(char[][] board) {
		for (char[] row : board) {
			for (char ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		System.out.println("===============================");
	}

	public static void solve(int r, int c, char[][] board) {
		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
			print(board);
			return;
		}
		if (board[r][c] != '.') {
			solve(r, c + 1, board);
		} else {
			for (char ch = '1'; ch <= '9'; ch++) {
				if (isSafe(ch, r, c, board)) {
					board[r][c] = ch;
					solve(r, c + 1, board);
				}
			}
			board[r][c] = '.';
		}

	}

	private static boolean isSafe(char ch, int R, int C, char[][] board) {
		
		for(int c =0;c<9;c++) {
			if(board[R][c]==ch) {
				return false;
			}
		}
		for(int r =0;r<9;r++) {
			if(board[r][C]==ch) {
				return false;
			}
		}
		int box_r = R/3;
		int box_c = C/3;
		for(int r = box_r*3;r< box_r*3+3;r++) {
			for(int c = box_c*3;c<box_c*3+3;c++) {
				if(board[r][c]==ch) {
					return false;
				}
			}
		}
		return true;
	}
}
