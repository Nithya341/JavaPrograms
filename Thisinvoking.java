package Assignments;

public class Thisinvoking {
	
	Thisinvoking()
	{
		
		System.out.println("Invoking the first constructor in the program");
		System.out.println("Welcome to this assignment");
	}
    
	Thisinvoking(int a,int b,int c){
		this();
		int sum = a+b+c;
		System.out.println("Invoking second constructor to perform addition");
		System.out.println("The value of three variables is -->"+ sum);
		
		
	}
	Thisinvoking(String a,String b){
		this(12,25,28);
		System.out.println("Invoking thrid constructor to perform string concatenation");
		System.out.println("The value of the strings -->"+a+b);
		
	
}
	public static void main(String args[]) {
		new Thisinvoking("Nithya","Sumithra");
	}
}