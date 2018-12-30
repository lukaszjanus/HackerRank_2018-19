/**
 * 
 */
package Day10_Binary_Numbers;

/**
 * @author Lukasz Janus
 * 19.10.2018
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

	/*
	 * Function 'zlicz': - change number to binary and add to ArrayList; - check
	 * list If this code help you understand this problem, you can write to me. :)
	 */
	public static int zlicz(int n) {

		int temp = 0;
		List<Integer> binar = new ArrayList<>();
		do {
			binar.add(n % 2);
			n /= 2;

		} while (n > 0);

		int max = 0;

		for (int i = 0; i < binar.size(); i++) {
			if (binar.get(i) == 0) {
				temp = 0;
			}
			if (binar.get(i) == 1) {
				temp++;
				if (temp > max) {
					max = temp;
				}
			}
		}

		return max;

	}

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		System.out.println(zlicz(n));
		scanner.close();
	}
}
