package Assignments;

public class Stringreplacetest {
	 static public void main(String args[]) {
		
		String n = "kv no 2";
		String n2 = "I'm in Gurgaon";
		String n3 = "I am The Boss";
		String n4 = "My name is Ram";
		String n5 = "My home is near to sector 2 Patna 4";
		String n6 = "I'm a boy";
		String n7 = " I'm a simple boy";
		String n8 = "My name is Shyam";
		System.out.println(n.replace('K', 'T'));
		System.out.println(n2.replace("Gurgaon", "Delhi"));
		System.out.println(n.replace("2","nothing"));
		System.out.println(n.replaceAll("[a-z]", ""));//41 assignment
		System.out.println(n3.replaceAll("[A-Z]", ""));//42
		System.out.println(n4.replaceAll("[0-9]", ""));//43
		boolean a1 = n4.matches("M(.*)");//45 assignment
		System.out.println(a1);
		boolean a2 = n6.matches("(.*)y");//46 assignment 
		System.out.println(a2);
		boolean a3 = n7.matches("(.*)s(.*)");//47 assignment 
		System.out.println(a3);
		System.out.println(n8.replaceAll(" ","_"));//48 assignment
		
		} 
		
}


		
	


