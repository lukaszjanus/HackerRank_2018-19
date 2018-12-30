/**
 * 
 */
package Day14_Scope;

/**
 * @author Lukasz Janus
 * 10.10.2018
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
	private int[] elements;
	public int maximumDifference;

	// End of Difference class
	Difference(int[] a) {
		elements = a;
		maximumDifference = Integer.MIN_VALUE;
	}

	public void computeDifference() {
		int temp = 0;
		for (int i = 0; i < elements.length; i++) {
			for (int j = elements.length - 1; j > i; j--) {
				temp = Math.abs(elements[j] - elements[i]);
				if (maximumDifference < temp)
					maximumDifference = temp;
				// System.out.println("test "+temp+" "+maximumDifference+" "+elements[j]+"
				// "+elements[i]);

			}
			// System.out.print("test "+elements[i]);
		}
		// System.out.println("test "+temp+" "+maximumDifference);
	}

}

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}