package Assignments;

public class NonStaticMethod {
			
		  void addition (double a , double b ) {
			double sum = a+b;
			System.out.println("The addition is "+sum);
			
		}
		
		 void subtraction(int a , int b ) {
			
			int sum = a-b;
			System.out.println("The subtraction is " +sum);
			
		}
		  void multiplication(int a,int b,int c) {
			 
			 int sume = a*b*c;
			 System.out.println("the multiplication is  "+ sume);
		 }
        void division(int a,int b) {
			 
			 int sume = a/b;
			 System.out.println("the division is  "+ sume);
		 }
		public static void main (String[] args) {
		NonStaticMethod n1 = new NonStaticMethod ();
			n1.addition(3.31, 7.56);
			n1.subtraction(12, 86);
			n1.multiplication(36,44,78);
			n1.division(56,90);
			
			//addition(32,64);
			//addition(6.15,2.54); v                               
		}

	}





