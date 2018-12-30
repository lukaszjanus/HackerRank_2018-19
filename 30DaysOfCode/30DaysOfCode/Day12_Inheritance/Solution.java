/**
 * 
 */
package Day12_Inheritance;

/**
 * @author Lukasz Janus
 * 21.10.2018
 */

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int[] testScores;

	/*
	 * Class Constructor
	 * 
	 * @param firstName - A string denoting the Person's first name.
	 * 
	 * @param lastName - A string denoting the Person's last name.
	 * 
	 * @param id - An integer denoting the Person's ID number.
	 * 
	 * @param scores - An array of integers denoting the Person's test scores.
	 */

	public Student(String firstName, String lastName, int identification, int[] testScores) {
		super(firstName, lastName, identification);
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
		this.testScores = testScores;
	}

	/*
	 * Method Name: calculate
	 * 
	 * @return A character denoting the grade.
	 */
	// Write your method here

	public char calculate() {
		char[] grade = { 'O', 'E', 'A', 'P', 'D', 'T' };
		int temp = 0;
		for (int i = 0; i < testScores.length; i++) {
			temp += testScores[i];
		}
		temp = temp / testScores.length;

		if (temp <= 100 && temp >= 90)
			return grade[0];
		else if (temp >= 80 && temp < 90)
			return grade[1];
		else if (temp >= 70 && temp < 80)
			return grade[2];
		else if (temp >= 55 && temp < 70)
			return grade[3];
		else if (temp >= 40 && temp < 55)
			return grade[4];
		else {
			return grade[5];
		}
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
