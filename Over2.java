package Assignments;

import java.util.Scanner;

public class Over2 extends Over1 {
	Scanner s1 = new Scanner (System.in);
	void subtraction()
	{
		super.subtraction();
		System.out.println("The subtractions is performed with fractions");
		System.out.println("Enter two number to perform subtraction");
		float a = s1.nextFloat();
		float b = s1.nextFloat();
		float sum=a-b;
		System.out.println(sum);
		
	}
	
	public static void main (String args[]) {
		Over2 n1 = new Over2();
		n1.subtraction();
	}
}
