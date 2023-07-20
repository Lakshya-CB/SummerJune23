package Lec_19;

public class blocked_maze {
	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		chal(0, 0, "", maze);

	}

	public static void chal(int r, int c, String path, int[][] maze) {
		if (r < 0 || r == maze.length || c < 0 || c == maze[0].length || maze[r][c] == 1) {
			return;
		}
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(path);
			return;
		}

		chal(r - 1, c, path + "U", maze);
		chal(r + 1, c, path + "D", maze);
		chal(r, c - 1, path + "L", maze);
		chal(r, c + 1, path + "R", maze);

	}
}
