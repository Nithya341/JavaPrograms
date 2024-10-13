package basicsprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Arraynull {
	public static void main(String[] args) {
		
		
	    int rollno1 [] = new int [4];
		
		Scanner s1 = new Scanner(System.in);
		for(int i=0;i<=3;i++) {
			rollno1[i]=s1.nextInt();
			if(rollno1[i]== null) {
				System.out.println("The value will not accept");
			}
			System.out.println(Arrays.toString(rollno1));

}
	}
}

