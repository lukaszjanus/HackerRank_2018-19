/**
 * 
 */
package Day29_Bitwise_And;

/**
 * @author Lukasz Janus
 * 08.11.2018
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

	public static void check(int n, int k) {
		// System.out.println("n: "+n+" k: "+k);
		int temp = 0;

		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				// System.out.println(" i&j "+(i&j)+" temp "+temp);
				if ((i & j) > temp && (i & j) < k) {
					temp = i & j;
				}
			}
			// System.out.println(" i: "+i+" "+tab[i]);
		}

		System.out.println(temp);

	}

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			String[] nk = scanner.nextLine().split(" ");

			int n = Integer.parseInt(nk[0]);

			int k = Integer.parseInt(nk[1]);

			check(n, k);
		}

		scanner.close();
	}
}
