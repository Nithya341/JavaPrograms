package Exceptions_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		
		try {
			
		System.out.println("enter the size of the array");
		Scanner s1 = new Scanner(System.in);
		int size = s1.nextInt();
		int [] rollno = new int[size];
		rollno[0]=78;
		rollno[1]=88;
		rollno[2]=68;
		}
		catch(NegativeArraySizeException c){
		
			System.out.println("The array size can be only positive numeric values");
			Scanner s1 = new Scanner(System.in);
			int size = s1.nextInt();
			int [] rollno = new int[size];
		}
		catch(ArrayIndexOutOfBoundsException a1){
			
			System.out.println("The array size is more please increase the size ");
			Scanner s1 = new Scanner(System.in);
			int size = s1.nextInt();
			int [] rollno = new int[size];
		}
          catch(InputMismatchException c){
			
			System.out.println("The array will accept only numbers ");
			Scanner s1 = new Scanner(System.in);
			int size = s1.nextInt();
			int [] rollno = new int[size];
		}
		finally {
			System.out.println("close the connection with database");
		}
		
		
	}

}
