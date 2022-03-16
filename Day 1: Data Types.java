import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int in;
        double doub;
        String str;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        in = scan.nextInt();
        doub = scan.nextDouble();
        scan.nextLine();
        str = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        System.out.println(in + i);
        /* Print the sum of the double variables on a new line. */
	System.out.printf("%.1f\n", d + doub);
        System.out.println(s + str);
        scan.close();
