/**
 * 
 */
package Day16_Exceptions_StringToInteger;

/**
 * @author Lukasz Janus
 * 24.10.2018
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();

		try {
			int d = Integer.parseInt(S);
			System.out.println(d);

		} catch (Exception e) {

			System.out.println("Bad String");

		}

	}
}