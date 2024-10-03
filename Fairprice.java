package Assignments;

import java.util.Scanner;
class Super{ //Super class with concrete methods
	void meth1() {
		System.out.println("This is method implemeted in super class ");
	}
	void meth2() {
		System.out.println("This is second method implemeted in super class ");
	}
}

abstract class Abstract extends Super{//Abstract class with abstract methods and concrete methods
	abstract void Ticket_booking();
	abstract void Ticket_faipricecalculation();
	void add()
	{
		System.out.println("This method is concreate method inside abstract class");
	}
	void sub()
	{
		System.out.println("This is second concreate method inside the abstract class");
	}
}

class Fairprice extends Abstract{//Abstract method sub class 
Scanner s1 = new Scanner (System.in);
	void Ticket_booking() {
		
	}

void Ticket_faipricecalculation() {
			
	}
void Ticket_price() {//Concrete  method
	System.out.println("enter the name of the passenger who is travelling ");
	String a=s1.next();
	System.out.println("Based on the calculation done in the abstarct class you booking in confirmed ");
}
void Inconvience() {//Concrete  method
	System.out.println("enter the name of the passenger who is travelling ");
	String a=s1.next();
	System.out.println("Sorry for the inconveience please try again after sometime ");
}

	
	public static void main(String[] args) {
		
	Fairprice obj = new Fairprice();
	obj.Ticket_booking();
	obj.Ticket_faipricecalculation();
	obj.Ticket_price();
	obj.Inconvience();
	obj.meth1();
	obj.meth2();
	}
}
