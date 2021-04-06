import java.util.Scanner;

public class AddOnetoElememt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int arrlen = s.nextInt();
		int[] arr = new int[arrlen];
		for (int i = 0; i < arrlen; i++) {
			System.out.printf("Enter the %d element of array : ",i);
			arr[i] = s.nextInt();
		}
		for(int i=0;i<arrlen;i++) {
			arr[i]=arr[i]+1;
		}
		for(int i=0;i<arrlen;i++) {
			System.out.printf(" %d ",arr[i]);
		}
		
	}

}
