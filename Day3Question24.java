import java.util.Scanner;

public class Day3Question24 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of rows : ");
		int n = s.nextInt();
		System.out.println("Enter the no. of column : ");
		int m = s.nextInt();
		if (n <= 0||m<=0) {
			System.out.println("[]");
			System.exit(1);
		}
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("Enter the element at position [%d][%d] :", i, j);
				a[i][j] = s.nextInt();
				if (a[i][j] != 0 && a[i][j] != 1) {
					System.err.println("Input shoud be either 0 or 1 ");
					System.exit(1);
				}

			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == 0) {
					a[i][j] = 1;
				} else {
					a[i][j] = 0;
				}

			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.printf("[");
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j]);

			}
			System.out.printf("]");
			System.out.println();
		}

	}

}
