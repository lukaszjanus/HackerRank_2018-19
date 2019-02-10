package practice.java.advanced.MD5;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
/**
 * 
 * @author Lukasz Janus
 * 10.02.2019.
 * 
 * Program create hash with MD5 algorithm.
 */
public class Solution {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();

		md5(s1);

	}

	/**
	 * 
	 * @param s1
	 */
	public static void md5(String s1){

        String hash="";

        try{
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(s1.getBytes(), 0, s1.length() );
            //output the MD5 Equivalent:
            System.out.println(new BigInteger(1, md.digest()).toString(16));

        } catch(NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        

    }
}