import java.util.Scanner;

public class Day4Question36 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = input.nextInt();
		if(a<0)
		{
			System.err.println("Error number should be positive integer ");
			System.exit(1);
		}
		int len = a + 1;
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			if (i == 0) {
				arr[i] = 0;
			} else if (i == 1) {
				arr[i] = 1;
			} else if (i == 2) {
				arr[i] = 2;
			} else {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		System.out.println(arr[len - 1]);

	}

}
