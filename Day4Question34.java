import java.util.Scanner;

public class Day4Question34 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Integer 1 : ");
		int num1 = s.nextInt();
		System.out.println("Enter the Integer 2 : ");
		int num2 = s.nextInt();
		int len1 = String.valueOf(num1).length();
		int len2 = String.valueOf(num2).length();
		if (len1 != len2) {
			System.err.println("Length of both integer should be same");
			System.exit(1);
		}
		int[] arr1 = new int[String.valueOf(num1).length()];
		int[] arr2 = new int[String.valueOf(num2).length()];
		int temp, i = 0, j = 0;
		while (num1 != 0) {
			temp = num1 % 10;
			arr1[i] = temp;
			num1 = num1 / 10;
			i++;
		}
		while (num2 != 0) {
			temp = num2 % 10;
			arr2[j] = temp;
			num2 = num2 / 10;
			j++;
		}
		int sum = 0;
		for (int m = 0; m < len1; m++) {
			if (arr2[m] < arr1[m]) {
				System.err.println("All digits in num2 have to be higher than their counterparts in num1.");
				System.exit(1);
			}
			sum = Math.abs(arr2[m] - arr1[m]) + sum;
		}
		System.out.println("OUTPUT : " + sum);

	}
}
