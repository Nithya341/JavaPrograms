package Assignments;

public class Inter3 implements Inter2,Inter1 {


	public void Ticket() {
		System.out.println("Actual method of Ticket");
			
	}

	public void discount() {
		System.out.println("Actual method of login");
		
		}
	void actual()
	{
		System.out.println("Welcome to Indigo");
		System.out.println("Yor ticket is booked");
	}
public static void main (String args[]) {
	Inter3 s1 = new Inter3();
	s1.actual();
	s1.Ticket();
	s1.discount();
}
}
