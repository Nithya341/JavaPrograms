package Assignments;

import java.util.Scanner;

public class Stringequalignorecase {
public static void main(String[] args) {
	Scanner s1 = new Scanner (System.in);
	System.out.println("enter the string");
	String input = s1.next();
	System.out.println("enter another string");
	String input1 = s1.next();
	boolean b1= input.equalsIgnoreCase(input1);
	System.out.println(b1);
	boolean b2 =input.equals(input1);
	System.out.println(b2);
}

}
