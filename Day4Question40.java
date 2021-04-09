import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day4Question40 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string s : ");
		String s1=s.next();
		System.out.println("Enter the string t : ");
		String s2=s.next();
		char[] arr1=s1.toCharArray();
		char[] arr3=s2.toCharArray();
		List<Character> list=new ArrayList<Character>();
		for(char c:arr3)
		{
			list.add(c);
		}
		int a=s1.length();
		int c=s2.length();
		int[] arr2=new int[a];
		int b=c+1;
		for(int j=0;j<a;j++)
		{
			arr2[j]=b;
			for(int i=0;i<c;i++)
			{
				if(arr1[j]==list.get(i))
				{
					arr2[j]=i;
					break;
				}
			}
			
		}
		/*for(int j=0;j<a;j++) {
			System.out.print(arr2[j]);
		}
		*/
		boolean bool=true;
		for(int j=0;j<a;j++) {
			if(arr2[j]==b) {
				bool=false;
			}
		}
		for(int j=0;j<a;j++) {
			for(int k=j+1;k<a;k++)
			if(arr2[k]<arr2[j])
			{
				bool=false;
			}
		}
		System.out.println("OUTPUT :"+bool);
	}

}
