import java.util.Scanner;

public class LargestpossibleSum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int n = s.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the %d element of array : ", i);
			A[i] = s.nextInt();
		}
		System.out.println("Enter no. of values to change from 0 to 1 (i.e K ) : ");
		int k = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (A[i] > A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}

		for (int i = 0; i < k; i++) {
			if (A[i] == 0) {
				break;
			} else {
				A[i] = A[i] * (-1);
			}
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + A[i];
		}
		System.out.println(sum);
	}

}
