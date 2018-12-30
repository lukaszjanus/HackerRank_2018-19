/**
 * 
 */
package Day11_2D_Arrays;

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

	public static void result(int[][] a) {
		int temp = -54;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
						+ a[i + 2][j + 2];
				if (sum > temp)
					temp = sum;
			}
		}

		System.out.println(temp);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		result(arr);

		scanner.close();
	}
}
