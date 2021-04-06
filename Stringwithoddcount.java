import java.util.Scanner;

public class Stringwithoddcount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the integer anything between 1 to 500 :  ");
		int len = s.nextInt();
		s.close();
		if(len>=1 &&len<=500) {
		StringBuilder str = new StringBuilder();
		if (len % 2 == 0) {
			for (int i = 0; i < len - 1; i++) {
				str.append("p");
			}
			str.append("z");
		} else {
			for (int j = 0; j < len; j++) {
				str.append("a");
			}
		}
		System.out.println(str);
		}
		else {
			System.out.println("ERROR : Enter number 1 and 500");
		}

	}

}
