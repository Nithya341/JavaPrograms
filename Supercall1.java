package Assignments;

public class Supercall1 extends Supercall{
	Supercall1(char g)
	{ 
		super("Nithya","Sumi");
		System.out.println("Invoking the constructor in the fistsuper call class");
	}
    Supercall1( int a,int b)
    {   
    	this('n');
    	System.out.println("Invoking constructor with arguments");
    	System.out.println("value of a and b --> "+a +b);
    	int sum = a+b;
    	System.out.println(sum);
    }

}
