import java.util.Scanner;

public class Day3Question27 {
	public static int[] arrayOfMultiple (int num,int length)
	{
		int[] arr=new int[length];
		for(int i=0;i<length;i++)
		{
			arr[i]=num*(i+1);
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=s.nextInt();
		System.out.println("Enter the length : ");
		int b=s.nextInt();
		int[] sol=new int[b];
		sol=arrayOfMultiple(a,b);
		System.out.print(" [");
		for(int i=0;i<b-1;i++)
		{
			System.out.print(sol[i]+",");
		}
		System.out.print(sol[b-1]+"]");
		
	}

}
