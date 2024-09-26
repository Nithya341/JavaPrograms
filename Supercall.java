package Assignments;

public class Supercall {
	Supercall()
	{
		System.out.println("Invoking the constructor in the fistsuper call class");
	}
    Supercall(String a,String b)
    { 
    	this();
    	System.out.println("Invoking constructor with arguments");
    	System.out.println("value of a and b --> "+a +b);
    }
}
