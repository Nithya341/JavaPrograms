package Assignments;

public class Supercall2 extends Supercall1 {
	 
	Supercall2(int a,int b)
	    {
		super(10,20);
	    	System.out.println("Invoking constructor with arguments");
	    	System.out.println("value of a and b --> "+a +b);
	    	int sum = a*b;
	    	System.out.println(sum);
	    }
	 public static void main (String args[])
	 {
		  new Supercall2(5,10);
		 
	 }

}
