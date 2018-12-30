/**
 * 
 */
package Day07_Arrays;

/**
 * @author Lukasz Janus
 * 09.10.2018
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
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int[] b = new int[n];
		int bl = n - 1;
		for (int i = 0; i < n; i++) {
			b[i] = arr[bl];
			bl--;
			System.out.print(b[i] + " ");
		}

		scanner.close();
	}
}
