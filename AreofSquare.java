package Assignments;

import java.util.Scanner;

public class AreofSquare {

	
	public static void main (String [] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter the side of the square");
		int r=n1.nextInt();
		double area = r*r;
		System.out.println("area of the square-> "+area);
		
		
	}
}
