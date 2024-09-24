package package1;

public class Emp2 extends Emp1{
	static void total() {
		
		System.out.println("The total salary including pf and base");
		double total = salary + pf;
		System.out.println(total);
		
		}
	public static void main(String[] args) 
	{    employesalary();
		 employpf();
		 total();
	}

}
