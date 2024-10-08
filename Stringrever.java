package Assignments;

import java.util.Scanner;

public class Stringrever {
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	String output="";
	System.out.println("Enter a word");
	String input = s1.next();
	int n=input.length();
	for(int i = n-1;i>=0;i--)
	{
    char c = input.charAt(i);
		output = output+c;
		
	}
		
	System.out.println("The reverse of the string"+output);
//boolean b1 = input.equals(output);
	if(input == output)
	{
		System.out.println("Palindrome");
	}
	else
	{

		System.out.println("not a palindrom");
	}
	}

}
