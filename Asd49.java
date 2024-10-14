package Assignments;

public class Asd49 {

	public static void main(String[] args) {
		String input = "RAM";
		char c []= input.toCharArray();
		for (int i = 0 ;i<input.length();i++) {
			System.out.println(c[i]);
			
		}
		for(int i = input.length()-1;i>=0;i--) {
			System.out.println(c[i]);
		}
	}
}
//for (char c : input.toCharArray)//it converts into character array and iterates and print it 