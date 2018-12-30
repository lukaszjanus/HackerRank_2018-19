/**
 * 
 */
package Day28_RegEx_Patterns_and_Intro_to_DB;

/**
 * @author Lukasz Janus
 * 09.11.2018
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String regexS = "[a-z]*@gmail.com";
		Pattern p = Pattern.compile(regexS);

		ArrayList<String> lista = new ArrayList<>();

		for (int NItr = 0; NItr < N; NItr++) {

			String[] firstNameEmailID = scanner.nextLine().split(" ");
			String firstName = firstNameEmailID[0];
			String emailID = firstNameEmailID[1];

			Matcher m = p.matcher(firstNameEmailID[1]);

			if (m.find()) {
				lista.add(firstNameEmailID[0]);
			}
		}

		Collections.sort(lista);
		// for(int i=0;i<lista.size();i++) System.out.println(lista.get(i));
		for (String s : lista)
			System.out.println(s);

		scanner.close();
	}
}
