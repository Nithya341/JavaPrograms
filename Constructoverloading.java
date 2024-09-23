package basicsprograms;

public class Constructoverloading {
	
		Constructoverloading() {
			System.out.println("1");
			
		}
		Constructoverloading(int a){
			System.out.println("2");
			
		}
		Constructoverloading(int a,int b){
			int sum = a+b;
			System.out.println("2"+ sum);
			
		}
		public static void main (String[] args) {
			new Constructoverloading();
			new Constructoverloading(300);
			new Constructoverloading(300,400);
		}
	}


