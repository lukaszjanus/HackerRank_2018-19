/**
 * 
 */
package Day26_Nested_Logic;

/**
 * @author Lukasz Janus
 * 08.11.2018
 */
import java.io.*;
import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Solution {

	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
		Scanner sc = new Scanner(System.in);

		int zwrotD = sc.nextInt();
		int zwrotM = sc.nextInt();
		int zwrotY = sc.nextInt();

		int dataD = sc.nextInt();
		int dataM = sc.nextInt();
		int dataY = sc.nextInt();

		LocalDate dataZwrotu = LocalDate.of(zwrotY, zwrotM, zwrotD);
		LocalDate dataOczekiwana = LocalDate.of(dataY, dataM, dataD);

		int fine = 0;

		// if(dataZwrotu.isBefore(dataOczekiwana) || dataZwrotu.equals(dataOczekiwana)
		// ){
		// System.out.println(fine);
		// }
		if (dataZwrotu.isAfter(dataOczekiwana)) {
			if (dataZwrotu.getYear() == dataOczekiwana.getYear()) {
				if (dataZwrotu.getMonth() == dataOczekiwana.getMonth()) {
					fine = 15 * (int) (dataZwrotu.getDayOfMonth() - dataOczekiwana.getDayOfMonth());
				} else {
					fine = 500 * (int) (dataZwrotu.getMonthValue() - dataOczekiwana.getMonthValue());
				}

			} else
				fine = 10000;
		}

		System.out.println(fine);

	}
}