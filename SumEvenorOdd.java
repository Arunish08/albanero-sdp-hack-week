import java.util.Scanner;

public class SumEvenorOdd {
	public static void main(String[] args) {
		int sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int arrlen = s.nextInt();
		int[] arr = new int[arrlen];
		for (int i = 0; i < arrlen; i++) {
			System.out.printf("Enter the %d element of array : ",i);
			arr[i] = s.nextInt();
		}
		for (int j = 0; j < arrlen; j++) {
			sum = sum + arr[j];
		}
		if (sum % 2 == 0) {
			System.out.println("\n even");
		} else {
			System.out.println("\n odd");
		}

	}

}
