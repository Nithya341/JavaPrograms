package Assignments;

import java.util.Scanner;

public class Switchassig {
	public static void main (String args[]) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for subtraction");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division");
		int input = s1.nextInt();
		
		switch(input)
		{
		case 1 : System.out.println("enter two numbers for addition");
		         int a = s1.nextInt();
		         int b = s1.nextInt();
		         int sum = a+b;
		         System.out.println("the sum of two numbers->"+sum);     
		                 
		        
		case 2 :  System.out.println("enter two numbers for subtraction");
                  int c = s1.nextInt();
                  int d = s1.nextInt();
                  int sub = c-d;
                  System.out.println("the subtraction of two numbers->"+sub);
                  
		case 3 :  System.out.println("enter two numbers for multiplication");
                  int e = s1.nextInt();
                  int f = s1.nextInt();
                  int mul = e*f;
                  System.out.println("the multiplication of two numbers->"+mul);
                  
		case 4 :  System.out.println("enter two numbers for division");
                  int x = s1.nextInt();
                  int y = s1.nextInt();
                  int div = x/y;
                  System.out.println("the sum of two numbers->"+div);
        default: System.out.println("selection is invalid can you try again please");
                 break;
		}
	}

}
