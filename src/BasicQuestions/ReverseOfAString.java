package BasicQuestions;

import java.util.Scanner;
/**
 * 
 * Reverse of a String
 * @author jyotiyadav
 *
 */
public class ReverseOfAString {

	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);
		String a = str.nextLine();

		char[] chars = a.toCharArray();
		for (int i = a.length() - 1; i >= 0; i--) {
			System.out.println(chars[i]);
		}
	}
}
