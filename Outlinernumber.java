import java.util.Scanner;

public class Outlinernumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int arrlen = s.nextInt();
		int[] arr = new int[arrlen];
		for (int i = 0; i < arrlen; i++) {
			System.out.printf("Enter the %d element of array : ", i);
			arr[i] = s.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < arrlen; i++) {
			if (arr[i] % 2 == 0) {
				temp++;
			}
		}

		if (temp > 1) {
			for (int i = 0; i < arrlen; i++) {
				if (arr[i] % 2 != 0)
					System.out.println(arr[i]);
			}
		} else {
			for (int i = 0; i < arrlen; i++) {
				if (arr[i] % 2 == 0)
					System.out.println(arr[i]);
			}
		}

	}

}
