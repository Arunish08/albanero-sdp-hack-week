import java.util.Scanner;

public class Day3Question30 {
	public static int MeanOfDigit(int num) {
		int len = String.valueOf(num).length();
		int[] arr = new int[len];
		int temp, p = 0;
		while (num != 0) {
			temp = num % 10;
			arr[p] = temp;
			num = num / 10;
			p++;
		}
		int sum = 0;
		for (int i = p - 1; i >= 0; i--) {
			sum = sum + arr[i];
		}
		int a = sum / len;

		return a;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Integer : ");
		int num = s.nextInt();
		int sol = MeanOfDigit(num);
		System.out.println(sol);

	}

}
