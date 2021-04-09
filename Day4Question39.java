import java.util.Scanner;

public class Day4Question39 {
	public static int maxium(int[] arr, int n) {
		int val = 0, e = 0;
		for (int i = 0; i < n; i++) {
			e = e + arr[i];
			if (val < e) {
				val = e;
			}
			if (e < 0) {
				e = 0;
			}
		}
		return val;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int a = s.nextInt();
		System.out.println("Enter the elements of array: ");
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = s.nextInt();
		}
		int max = maxium(arr, a);
		System.out.println(max);

	}
}
