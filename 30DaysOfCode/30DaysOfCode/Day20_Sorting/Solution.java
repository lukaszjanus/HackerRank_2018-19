/**
 * 
 */
package Day20_Sorting;

/**
 * @author Lukasz Janus
 * 26.10.2018
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	// static int[] a= {3,2,1};
	// static int n = a.length;
	static int count = 0;

	public static void sortuj(int[] a) {

		int n = a.length;

		for (int i = 0; i < n; i++) {
			int swapy = 0;

			for (int j = 0; j < n - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapy++;
					count++;
				}
			}
			if (swapy == 0)
				break;
		}

		// roboczo - wyswietlanie

		// for(int i=0;i<n;i++) {
		// System.out.print(a[i]+" ");
		// }

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		sortuj(a);

		System.out.println("Array is sorted in " + count + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);

	}
}