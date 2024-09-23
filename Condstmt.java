package basicsprograms;

import java.util.Scanner;

public class Condstmt {
	
	public static void main (String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s1.nextInt();
		if(age >=18)
		{
			System.out.println("You are eligible to vote");
		}
		
		else {
			System.out.println(" you are not eligible to vote");
		}
		
	}

}
