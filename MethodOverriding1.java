package Assignments;

import java.util.Scanner;

public class MethodOverriding1 extends MethodOverriding{
	Scanner s1 = new Scanner (System.in);
	void add()
	{
		System.out.println("Enter the details of the number to do sum");
		int a= s1.nextInt();
		int b = s1.nextInt();
		int sum= a+b;
		System.out.println("the value of two numbers is -->"+sum);
		super.add();
		
	}



public static void main(String args[])
{
	MethodOverriding1 n1= new MethodOverriding1();
	n1.add();
}
}
