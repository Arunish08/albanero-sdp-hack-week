import java.util.Scanner;

public class Day2Question9 {
	public static boolean check(int[] arr, int len, int val) {
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] + arr[j] == val) {
					return true;

				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the %d element of array : ", i);
			arr[i] = s.nextInt();

		}
		System.out.println("Enter any number to match with multiple of two element :");
		int num = s.nextInt();

		boolean b = check(arr, n, num);
		if (b == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
