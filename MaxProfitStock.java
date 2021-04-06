import java.util.Scanner;

public class MaxProfitStock {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the %d element of array : ", i);
			arr[i] = s.nextInt();
		}
		int[] diff = new int[n - 1];
		int i = 0, j = 0, sum = 0;
		while (i != n - 1) {
			diff[i] = arr[i + 1] - arr[i];
			i++;
		}
		while (j != n - 1) {
			if (diff[j] > 0) {
				sum += diff[j];
			}
			j++;
		}
		System.out.println(sum);
	}

}
