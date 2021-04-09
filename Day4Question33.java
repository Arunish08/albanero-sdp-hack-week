import java.util.Scanner;

public class Day4Question33 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array : ");
		int a=s.nextInt();
		String arr[]=new String[a];
		int temp;
		String arr2[]=new String[a];
		for(int i=0;i<a;i++)
		{
			System.out.printf("Enter the %d name in array :",i);
			arr[i]=s.next();
			temp=arr[i].length();
			char[] c=new char[temp];
			c=arr[i].toCharArray();
			char[] c2=new char[temp];
			for(int j=0;j<temp;j++)
			{
				if(j==0)
				{
					c2[j]=Character.toUpperCase(c[j]);
				}
				else {
					c2[j]=Character.toLowerCase(c[j]);
				}
			}
			//for(int j=0;j<temp;j++) {
			//System.out.println(c2[j]);
			//}
			String str = new String(c2);
			arr2[i]=str;
			//System.out.print(arr2[i]);
		}
		System.out.print("[ ");
		for(int i=0;i<a;i++)
		{
			System.out.print('"'+arr2[i]+'"');
		}
		System.out.print(" ]");
}
}
