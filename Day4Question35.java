import java.util.Scanner;

public class Day4Question35 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Integer 1 : ");
		int num1 = s.nextInt();
		System.out.println("Enter the Integer 2 : ");
		int num2 = s.nextInt();
		int len1 = String.valueOf(num1).length();
		int len2 = String.valueOf(num2).length();
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
		int sum1 = 0, sum2 = 0;
		for (int a = 0; a < len1; a++) {
			sum1 = sum1 + arr1[a];
		}
		for (int a = 0; a < len2; a++) {
			sum2 = sum2 + arr2[a];
		}
		if (sum1 == sum2) {
			System.out.println(" true ");
		} else {
			System.out.println(" false");
		}

	}

}
