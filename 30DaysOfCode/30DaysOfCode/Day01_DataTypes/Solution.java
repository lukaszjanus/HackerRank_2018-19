/**
 * 
 */
package Day01_DataTypes;

/**
 * @author £ukasz Janus
 * 03.10.2018
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int ii = scan.nextInt();
		double dd = scan.nextDouble();

		String st = scan.next();
		st += scan.nextLine();

		System.out.println(i + ii);

		System.out.println(d + dd);

		System.out.println(s + st);
		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */

		scan.close();
	}
}