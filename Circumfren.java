package Assignments;

import java.util.Scanner;

public class Circumfren {
final static double p1 =3.14;
	
	public static void main (String [] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int r=n1.nextInt();
		double area = 2*p1*r;
		System.out.println("area of the circle-> "+area);
		
	}		

}
