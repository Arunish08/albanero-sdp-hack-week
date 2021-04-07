import java.util.Scanner;

public class Day2Question7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of rows : ");
		int n = s.nextInt();
		System.out.println("Enter the no. of column : ");
		int m = s.nextInt();
		int[][] a = new int[n][m];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("Enter the element at position [%d][%d] :", i, j);
				a[i][j] = s.nextInt();
				if (a[i][j] % 2 == 0) {
					sum = sum + a[i][j];
				}
			}
		}
		System.out.println("OUTPUT : " + sum);
	}

}
