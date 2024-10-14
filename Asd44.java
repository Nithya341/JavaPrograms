package Assignments;

public class Asd44 {
	static int count_of_alpha;
	public static void main(String[] args) {
		
		String input = "kv no 2";
		char c [] = input.toCharArray();
		for (int i=0;i<input.length();i++) {
			
			boolean b=	Character.isAlphabetic(c[i]);
			if(b==true) {
				count_of_alpha++;
			
			}	
			
			
		}
		System.out.println(count_of_alpha);
	}

}
