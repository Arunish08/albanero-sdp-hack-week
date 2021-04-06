import java.util.Scanner;

public class ArithmeticProgression {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first element : ");
		int a=s.nextInt();
		System.out.println("Enter the Difference : ");
		int d=s.nextInt();
		System.out.println("Enter the total no. element in sequence : ");
		int n=s.nextInt();
		for(int i=0;i<n-1;i++)
		{
			System.out.printf("%d"+", ",a);
			a=a+d;
		}
		System.out.printf("%d",a);
		
	}

}
