package Assignments;

import java.util.Scanner;

public class AreaofRectangle {

	
	public static void main (String [] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		int r=n1.nextInt();
		System.out.println("enter the width of the rectangle");
		int h = n1.nextInt();
		double area =r*h;
		System.out.println("area of the rectangle-> "+area);
		
	}		

}
