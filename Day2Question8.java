import java.util.Scanner;

public class Day2Question8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find its factor : ");
		int n = s.nextInt();
		int[] arr = new int[n];
		int temp = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				temp++;
				arr[temp - 1] = i;
			}
		}
		System.out.print("[ ");
		for (int i = 0; i < temp; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}

}
