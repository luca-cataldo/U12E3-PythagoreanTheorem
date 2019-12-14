/*
Name: PythagoreanTheorem
Purpose: Find the length of the hypotenuse in a triangle and print it.
Author: Luca Cataldo
Date: Dec 13, 2019
*/

import java.io.*;

public class PythagoreanTheorem
{
    public static void main (String[] args) throws IOException
    {
	System.out.print ("1. ");
	findLeg (6, 8.49);
	System.out.print ("2. ");
	findLeg (4.6, 6.1);
	System.out.print ("3. ");
	findHypotenuse (2.5, 3.8);
	System.out.print ("4. ");
	findLeg (7.6, 9.1);
	System.out.print ("5. ");
	findLeg (9.6, 14.01);
	System.out.print ("6. ");
	findHypotenuse (5.4, 7);


    }

    public static double findHypotenuse (double legLengthA, double legLengthB)
    {
	double part1 = Math.pow (legLengthA, 2);
	double part2 = Math.pow (legLengthB, 2);
	double part3 = part1 + part2;
	double findHypotenuseA = Math.sqrt (part3);
	System.out.println (findHypotenuseA);
	return findHypotenuseA;
    }

    public static double findLeg (double hypotenuseLength, double legLengthX)
    {
	double part1 = Math.pow (hypotenuseLength, 2);
	double part2 = Math.pow (legLengthX, 2);
	double part3 = part2 - part1;
	double findLegA = Math.sqrt (part3);
	System.out.println (findLegA);
	return findLegA;
    }
}
