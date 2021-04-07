import java.util.Scanner;

public class Day2Question4 {
	public static int[] asending(int[] arr,int n) {
		if (n == 0) {
			int[] ar= {};
			return ar;
		}
		else {
			int temp = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			return arr;
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int n = s.nextInt();
		
		if (n < 0) {
			System.err.println("please enter integer input");
			System.exit(1);
		}
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the %d element of array : ", i);
			arr[i] = s.nextInt();
		}
		int[] abc=asending(arr,n);
		
		System.out.print("[ ");
		for (int i = 0; i < n ; i++) {
			System.out.print(abc[i]+" ");
		}
		System.out.print("]");
	}

}
