package Assignments;

import java.util.Scanner;

public class AreaofCircle {
	final static double p1 =3.14;
	
	public static void main (String [] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int r=n1.nextInt();
		System.out.println("enter the heighr of the circle");
		int h = n1.nextInt();
		double area = p1*r*r*h;
		System.out.println("area of the circle-> "+area);
		
		
	}

}
