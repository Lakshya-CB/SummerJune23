package Lec_19;

public class blocked_maze2 {
	public static void main(String[] args) {
		
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		
		chal(0, 0, "", maze, new boolean[maze.length][maze[0].length]);

	}

	public static void chal(int r, int c, String path, int[][] maze,boolean[][] visited) {
		if (r < 0 || r == maze.length || c < 0 || 
				c == maze[0].length || maze[r][c] == 1||visited[r][c]) {
			return;
		}
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			System.out.println(path);
			return;
		}
		visited[r][c] = true;
		chal(r - 1, c, path + "U", maze,visited);
		chal(r + 1, c, path + "D", maze,visited);
		chal(r, c - 1, path + "L", maze,visited);
		chal(r, c + 1, path + "R", maze,visited);
		visited[r][c] = false;
		
	}
}
