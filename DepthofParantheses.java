import java.util.Scanner;

public class DepthofParantheses {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string : ");
		str=s.nextLine();
		if(str.length()>100) {
			System.err.println("string length should be less than 100");
			System.exit(1);
		}
		if(!str.matches("['[0-9]','+','-','*','/','(',')']+")) {
			System.err.println(" ERROR ");
			System.exit(1);
		}
		int n=0,count=0;
		int len=str.length();
		for(int i=0;i<len;i++) {
			if(str.charAt(i)=='(') {
				count++;
				if(count>n) {
					n=count;
				}
			}
			else if(str.charAt(i)==')') {
				if(count>0) {
					count--;
				}
				else {
					System.out.println(" NOT VPS");
					System.exit(1);
				}
			}
		}
		if(count!=0) {
			System.out.println(" NOT VPS");
			System.exit(1);
		}
		
		System.out.printf("%d",n);
	}

}
