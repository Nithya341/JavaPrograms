package Assignments;

import java.util.Date;

public class Current_time_stamp {
	public static void main(String[] args) {
		
		Date d1 = new Date();
	long c= d1.getTime();
	System.out.println(c);
	Date d2 = new Date(d1.getTime()+(1000
			*60*60*24*1));//just update the last digit according to the no of days required .
	System.out.println(d2);
	
    String d3 = d2.toString();
String month =     d3.substring(4,7);
String year = d3.substring(d3.length()-4);
String date = d3.substring(8,10);
String element = 
date.concat("").concat(month).concat(year);
System.out.println(element);
		


	}

}
