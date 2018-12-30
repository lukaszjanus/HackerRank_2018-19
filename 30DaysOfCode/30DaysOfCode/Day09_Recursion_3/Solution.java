/**
 * 
 */
package Day09_Recursion_3;

/**
 * @author Lukasz Janus
 * 10.10.2018
 */
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	public static int g = 1;

	// Complete the factorial function below.
	static int factorial(int n) {
		if (n >= 2) {
			//System.out.println("if: " + n);
			g *= n;

			return factorial(n - 1);

		} else {
			//System.out.println("else: " + n);
			// g++;
			return g;
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int result = factorial(n);
		
		System.out.println(String.valueOf(result));

		//bufferedWriter.write(String.valueOf(result));
		//bufferedWriter.newLine();

		//bufferedWriter.close();

		scanner.close();
	}
}
