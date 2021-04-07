import java.util.Scanner;

public class Day2Question5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.printf("Enter the %d element of array : ", i);
			arr[i] = s.nextInt();
			if(arr[i]<1&&arr[i]>3000)
			{
				System.err.println("ERROR : range 1 t0 3000");
			}
		}
			int[] even = new int[n];
			int temp=0;
			for(int i=0;i<n;i++)
			{
				if(arr[i]%2==0)
				{
					even[temp]=arr[i];
					temp++;
				}
			}
			System.out.printf("Output : " +"[ ");
			for(int j=0;j<temp-1;j++)
			{
				System.out.printf("%d"+",",even[j]);
			}
			
			System.out.printf("%d"+" ]",even[temp-1]);
		
	}
}
