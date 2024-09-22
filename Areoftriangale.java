package Assignments;

import java.util.Scanner;

public class Areoftriangale {


	public static void main (String [] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter the base of the triangle");
		int b=n1.nextInt();
		System.out.println("enter the height of the triangle");
		int h = n1.nextInt();
		double area = 0.5*b*h;
		System.out.println("area of the triangle-> "+area);
	}
		
}
