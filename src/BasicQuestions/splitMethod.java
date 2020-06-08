package BasicQuestions;

import java.util.Scanner;

public class splitMethod {

	/**
	 * 
	 * Split Method
	 * 
	 * @author jyotiyadav
	 */

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		String[] s1 = str.split("-");
		
		for (int i = 0; i <s1.length; i++) {
			System.out.println(s1[i]);
		}
	}
}
