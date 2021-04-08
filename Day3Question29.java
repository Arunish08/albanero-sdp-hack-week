import java.util.Scanner;

public class Day3Question29 {

	public static int SquaringOfInteger(int num) {
		int len=String.valueOf(num).length();
		int[] arr=new int[len];
		int temp,p=0;
		while(num!=0) {
			temp=num%10;
			arr[p]=temp;
			num=num/10;
			p++;
		}
		
		for(int i=p-1;i>=0;i--)
		{
			arr[i]=arr[i]*arr[i];
		}
		StringBuilder strNum = new StringBuilder();
		for(int i=p-1;i>=0;i--)
		{
			 strNum.append(arr[i]);
		}
		int a = Integer.parseInt(strNum.toString());
		return a;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Integer : ");
		int num=s.nextInt();
		int sol=SquaringOfInteger(num);
		System.out.println(sol);
		
}
}
