package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysequals {
	public static void main(String[] args) {
		Scanner s1 = new Scanner (System.in);
		int mark [] = new int[4];
		int checkvalue;	
		int mark1 [] = new int[4];
		System.out.println("enter homegenoious of 4 values ");
		for(int i=0;i<=3;i++) {
			mark[i]=s1.nextInt();
			
		}
		System.out.println(Arrays.toString(mark));
		System.out.println("enter homegenoious of another 4 values ");
		for(int i=0;i<=3;i++) {
			mark1[i]=s1.nextInt();
			
		}
		System.out.println(Arrays.toString(mark1));
		
		boolean b1 = Arrays.equals(mark, mark1);
		if(b1==true) {
			System.out.println("the Arrays you have entered are same");
		}
		else {
			System.out.println("The arrays you have entered are different");
		}
		System.out.println("enter the value which you want to check in this Array");
		checkvalue=s1.nextInt();
		for(int i=0;i<=3;i++) {
			
			if(checkvalue==mark[i]) {
				System.out.println("Value is present");
				
			}
			else 
			{
				System.out.println("No value");
			}
			
		}
		for(int i=0;i<=3;i++) {
		
			if(checkvalue==mark1[i]) {
				System.out.println("Value is present");
				
			}
			else 
			{
				System.out.println("No value");
			}
			
		}

		
	}
	

}
