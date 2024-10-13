package basicsprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayruntime {
	public static void main(String[] args) {
		
	
    int rollno1 [] = new int [4];
	int rollno[] = new int[4];
	Scanner s1 = new Scanner(System.in);
	for(int i=0;i<=3;i++) {
		rollno[i]=s1.nextInt();
		rollno1[i]=rollno[i];
	}
	
  System.out.println(Arrays.toString(rollno));//getting the arrays in the runtime and printing it 
  System.out.println(Arrays.toString(rollno1));
}
}
