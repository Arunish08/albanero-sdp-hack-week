import java.util.Scanner;

public class Day2Question10 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 10 integer element in array  ");
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.printf("Enter the %d element of array : ", i);
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum = sum + arr[i];
		}
		System.out.println("\n OUTPUT : " + sum);
	}
}
