import java.util.Scanner;

public class LongestsubarrayofOne {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int n= s.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the %d element of array : ", i);
			A[i] = s.nextInt();
		}
		System.out.println("Enter no. of values to change from 0 to 1 (i.e K ) : ");
		int k=s.nextInt();
		int left=0,right=0,temp=0;
		int max=0;
		for(;right<n;right++)
		{
			if(A[right]==0) {
				temp++;
			}
			while(temp>k) {
				if(A[left]==0) {
					temp--;
				}
				left++;
			}
			if(right-left+1>max)
			{
				max=right-left+1;
			}
			
		}
		System.out.println(max);
		
	}

}
