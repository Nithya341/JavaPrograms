package basicsprograms;

import java.util.Arrays;

public class Stringanagram {
	public static void main(String[] args) {
		
		String s1 ="cafe";
		String s2 = "face";
		if(s1.length()!=s2.length()) {
			System.out.println("They are not anagram");
		}
		else
		{
		char [] c = s1.toCharArray();
		char [] c1 = s2.toCharArray();
		 Arrays.sort(c);
		 Arrays.sort(c1);
	boolean b1=	 Arrays.equals(c, c1);
	System.out.println(b1);
		
	}

}
}