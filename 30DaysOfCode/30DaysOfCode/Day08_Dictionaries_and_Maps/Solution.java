/**
 * 
 */
package Day08_Dictionaries_and_Maps;

/**
 * @author Lukasz Janus
 * 09.10.2018
 */
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> Ksiazka = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			Ksiazka.put(name, phone);
		}

		while (in.hasNext()) {
			String s = in.next();

			if (Ksiazka.containsKey(s)) {
				System.out.println(s + "=" + Ksiazka.get(s));
			} else {
				System.out.println("Not found");
			}

		}

		in.close();
	}
}