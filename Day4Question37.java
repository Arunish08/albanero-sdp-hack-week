import java.util.Scanner;

public class Day4Question37 {
	public static int CountNoOfone(int num) {
		int count = 0;
		while (num != 0) {
			if (num % 2 == 1) {
				count++;
			}
			num = num / 2;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the integer : ");
		int a = s.nextInt();
		int[] arr = new int[a + 1];
		for (int i = 0; i <= a; i++) {
			arr[i] = CountNoOfone(i);
		}
		System.out.print("[ ");
		for (int i = 0; i <= a; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("]");
	}

}
