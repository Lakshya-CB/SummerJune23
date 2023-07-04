package Lec_11;

public class array_2d_QPS {
	public static void main(String[] args) {
		int[][] arr = {

				{ 11, 12, 13, 14 }};
//		wavey(arr);
		spiral(arr);

	}

	public static void wavey(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			} else {
				for (int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void spiral(int[][] arr) {

		int rs = 0;
		int re = arr.length - 1;
		int cs = 0;
		int ce = arr[0].length - 1;
		int cnt = 0;
		int limit = arr.length * arr[0].length;
		while (rs<=re && cs<=ce) {

			for (int r = rs; r <= re && cnt< limit; r++) {
				System.out.print(arr[r][cs]+" ");
				cnt++;
				
			}
			System.out.println();
			
			for (int c = cs + 1; c <= ce && cnt< limit; c++) {
				System.out.print(arr[re][c]+" ");
				cnt++;
				
			}
			System.out.println();
			
			for (int r = re - 1; r >= rs && cnt< limit; r--) {
				System.out.print(arr[r][ce]+" ");
				cnt++;
				
			}
			System.out.println();
			
			for (int c = ce - 1; c >= cs + 1 && cnt< limit; c--) {
				System.out.print(arr[rs][c]+" ");
				cnt++;
				
			}
			System.out.println();
			
			rs++;cs++;re--;ce--;
		}
		
	}
	public static boolean find(int[][] arr, int ali) {
		int r = arr.length-1;
		int c = arr[0].length-1;
		while(r>=0 && c<arr[0].length) {
			if(arr[r][c]==ali) {
				return true;
			}else if(arr[r][c]<ali) {
				c++;
			}else {
				r--;
			}
		}
		return false;
	}

}
