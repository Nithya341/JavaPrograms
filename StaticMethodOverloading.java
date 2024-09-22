package Assignments;

public class StaticMethodOverloading {
			
		 static void addition (double a , double b ) {
			double sum = a+b;
			System.out.println("The addition is "+sum);
			
		}
		
		static void subtraction(int a , int b ) {
			
			int sum = a-b;
			System.out.println("The subtraction is " +sum);
			
		}
		 static void multiplication(int a,int b) {
			 
			 int sume = a*b;
			 System.out.println("the multiplication is  "+ sume);
		 }
        static void division(int a,int b) {
			 
			 int sume = a/b;
			 System.out.println("the division is  "+ sume);
		 }
		public static void main (String[] args) {
			//StaticMethodOverloading n1 = new StaticMethodOverloading ();
			addition(3.31, 7.56);
			subtraction(12, 86);
			multiplication(36,44);
			division(56,90);
			
			//addition(32,64);
			//addition(6.15,2.54); v                               
		}

	}


