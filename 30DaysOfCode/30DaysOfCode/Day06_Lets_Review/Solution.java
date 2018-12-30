/**
 * 
 */
package Day06_Lets_Review;

/**
 * @author Lukasz Janus
 * 09.10.2018
 */
import java.io.*;
import java.util.*;

public class Solution {

	public static void view(String t) {
		// System.out.println("View: "+n+", "+t);

		for (int i = 0; i < t.length(); i++) {

			if (i % 2 == 0) {
				char g = t.charAt(i);
				System.out.print(g);
			}
		}
		System.out.print(" ");
		for (int i = 0; i < t.length(); i++) {

			if (i % 2 != 0) {
				char g = t.charAt(i);
				System.out.print(g);
			}
		}
		System.out.print("\n");

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		n = scan.nextInt();
		String text;
		for (int i = 0; i < n; i++) {

			text = scan.next();

			view(text);

		}

	}
}