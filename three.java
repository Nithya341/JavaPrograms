package package1;

public class three extends Two{
	
	static void details()
	{ 
		System.out.println("in this program we will get the details of");
		System.out.println("Area of cube");
		System.out.println("Area of cylinder");
		System.out.println("Area of trapezodial");
	}
	
     public static void main (String args[]) {
    	 three s1 = new three();
    	 s1.trapezode();
    	 s1.cbe();
    	 total();
    	 details();
     }
}
