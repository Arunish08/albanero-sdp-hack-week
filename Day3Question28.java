
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day3Question28 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string of 7 Bits : ");
		String str = s.next();
		int len = str.length();
		if (len != 7) {
			System.err.println("All inputs will be 7-bits long (so that the parity bit makes it a full byte).");
			System.exit(1);
		}
		char[] arr = new char[len];
		arr = str.toCharArray();
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] != '0' && arr[i] != '1') {
				System.err.println("bits should be either 0 or 1 ");
				System.exit(1);
			} else if (arr[i] == '1') {
				count++;
			}
		}
		List<Character> lis = new ArrayList<Character>();
		for (char c : arr) {
			lis.add(c);
		}
		if (count % 2 == 0) {
			lis.add('0');
		} else {
			lis.add('1');
		}
		System.out.println(lis);

	}

}
