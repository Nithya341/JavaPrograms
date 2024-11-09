package Exceptions_throws;

public class ThisKeyword {
	String name = "sumithra";
	double salary = 169221;
	int age = 46;
	void Student_details(String name,double salary,int age) {
		//this.age = age;//only in non static both methods and variable should be non static 
		//this.name="kowsik";
		this.salary=salary;//assigned the local variable value to global variable
		System.out.println("My name is  "+name);
		System.out.println("My age is  "+age);
		System.out.println("My salary is  "+salary);
		
	}
	public static void main(String[] args) {
		ThisKeyword t1 = new ThisKeyword();
		t1.Student_details("nithya", 3444,31);
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.salary);
	}
	

}
