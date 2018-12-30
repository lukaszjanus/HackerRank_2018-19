/**
 * 
 */
package Day25_Running_Time_and_Complexity;

/**
 * @author Lukasz Janus
 * 27.10.2018
 */
import java.io.*;
import java.util.*;

public class Solution {

	public static String check(int g) {

		if (g == 1)
			return "Not prime";
		if (g == 2)
			return "Prime";

		int temp = (int) Math.sqrt(g);

		for (int i = 2; i <= temp; i++) {
			if (g % i == 0) {
				return "Not prime";
			}

		}
		return "Prime";
	}

	public static void main(String[] args) {
		Scanner wczyt = new Scanner(System.in);
		int n = wczyt.nextInt();
		for (int i = 0; i < n; i++) {
			int g = wczyt.nextInt();
			System.out.println(check(g));

		}

	}

}
