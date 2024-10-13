package basicsprograms;

public class Findingchartypestring {
static	int count_of_alpha;
static	int count_of_numeric;
static	int count_of_space;
	public static void main(String[] args) {
	
		
		String input ="kv no 2 bangalore";
		char c1[] = input.toCharArray();
		for(int i=0;i<input.length();i++) {
			
		
	boolean b=	Character.isAlphabetic(c1[i]);
	if(b==true) {
		count_of_alpha++;
	
	}
	boolean a=Character.isDigit(c1[i]);
	if(a==true) {
		count_of_numeric++;
	}
	boolean c=Character.isWhitespace(c1[i]);
	if(c==true) {
		count_of_space++;
	}
		}
		System.out.println("The total count of characters--->"+count_of_alpha);
		System.out.println("The total count of numbers-->"+count_of_numeric);
		System.out.println("The total count of numbers-->"+count_of_space);
		
		int count_of_special=input.length()-(count_of_alpha+count_of_numeric+count_of_space);
		System.out.println("The total count of numbers-->"+count_of_space);
	}

}
