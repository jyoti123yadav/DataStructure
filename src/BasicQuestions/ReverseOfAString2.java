package BasicQuestions;

import java.util.Scanner;

/**
 * 
 * Thereafter, we have used a split() method to split the string into its
 * substrings(no delimiter given here). Finally, we have printed the string in
 * reverse order using for loop.
 * 
 * @author jyotiyadav
 *
 */

public class ReverseOfAString2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		String[] s1 = str.split("");

		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.println(s1[i]);
		}

	}
}
