import java.util.Scanner;

public class Day3Question25 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=s.next();
		char arr[]=new char[str.length()];
		arr=str.toLowerCase().toCharArray();
		//System.out.print(arr);
		int flag=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if(arr[i]==arr[j])
				{
					flag=1;
					break;
				}	
			}
			if(flag==1) {
				break;
				}
			//System.out.println("hello");
		}
		if(flag==1) {
		System.out.println("OUTPUT : "+"false");
		}
		else {
		System.out.println("OUTPUT : "+"true");
		}
	}

}
