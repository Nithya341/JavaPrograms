package Assignments;


abstract class imple{
		abstract void method1();// abstract method
		abstract void method2();// abstract method
		void method4() {
			System.out.println("this is method 4 implementation");//Concrete method
		}
}
		public class Abs extends imple {
			void set()//concrete method 
			{
			 System.out.println("This is concrete method implementation");
			}

			@Override
			void method1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			void method2() {
				// TODO Auto-generated method stub
				
			}
		
	
public static void main(String[] args) {
	
	Abs s1 = new Abs();
	s1.set();
	s1.method1();
	s1.method2();
	s1.method4();
			
		
}
		}


