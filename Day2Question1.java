
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day2Question1 {
	private static String getHash(String str) {
		Map<Character, Integer> map = new HashMap<>();
		StringBuffer sb = new StringBuffer();

		int index = 0;
		for (char c : str.toCharArray()) {

			if (!map.containsKey(c)) {
				map.put(c, index++);
			}
			sb.append(map.get(c));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. of element in array :  ");
		int n = s.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter the string in array at %d  : ", i);
			arr[i] = s.next();
		}
		System.out.println("Enter the pattern string : ");
		String pattern = s.next();

		String hash = getHash(pattern);
		String matchWord = "";

		for (String word : arr) {

			/** Length and Hash must be eql to pattern **/
			if (pattern.length() == word.length() && hash.equals(getHash(word))) {
				matchWord = word + " " + matchWord;
			}
		}
		System.out.println("OUTPUT : "+"[ "+matchWord+"]");

	}
}
