import java.util.Scanner;

public class Day2Question6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int n = s.nextInt();
		if(n==0)
		{
			System.out.println("[]");
			System.exit(1);
		}
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.printf("Enter the %d element of array : ", i);
			arr[i] = s.nextInt();
			
		}
		int count=0,sum=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				count++;
			}
			else {
				sum=sum+arr[i];
			}
		}
		System.out.println("["+count+","+sum+"]");
	}

}
