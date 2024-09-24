package package1;
public class Two extends One
{
	void total() {
			
	System.out.println("The total salary including pf and base");
	double total = salary + pf;
	System.out.println(total);
	
	}
public static void main(String[] args) 
{
	Two n1 = new Two();
	n1.employesalary();
	n1.employpf();
	n1.total();
}
}
