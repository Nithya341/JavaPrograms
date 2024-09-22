package Assignments;

public class Arthimaticoperations {
	
	 void add() {
			
		int a= 100;
		int b =15;
		int sum = a+b;
		
		System.out.print("sum"+sum);
	}
		 void sub() {
			
			int a= 100;
			int b =15;
			int sum = a-b;
			
			System.out.print("sub"  +sum);
		
	}
	 void multiplication() {
			
			int a= 100;
			int b =15;
			int sum = a*b;
			
			System.out.print("multiplication "+sum);
		
	}
	 void division() {
			
			int a= 100;
			int b =15;
			int sum = a/b;
			
			System.out.print("division"+sum);
	 }
	 
	 void modules() {
			
			int a= 100;
			int b =15;
			int sum = a%b;
			
			System.out.print("modules"+sum);
	 }
	 
		
		public static void main (String args[])
		{
			Arthimaticoperations n1 = new Arthimaticoperations();
			n1.sub();
			n1.add();
			n1.multiplication();
			n1.division();
			n1.modules();
			
		}
			
	}



