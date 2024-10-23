package List_Arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInteface2_iteration {
public static void main(String[] args) {
	
	Map<String,Double> m1 = new HashMap<String,Double>();
	m1.put("Nithya",85909.09);
	m1.put("Sumi",8509.09);
	m1.put("Kavi",66909.09);
	m1.put("Anand",73921.09);
	m1.put("Triger",55345.09);
	m1.merge("Kavi", 38711.98);
	
//	System.out.println(m1.keySet());
//	for(String s1:m1.keySet())//to print only the key value
//	{
//		System.out.println(s1);
//	}
//	for(Double s1:m1.values())
//	{
//		System.out.println(s1);// to print only the value
//	}
	for(Entry<String, Double> i2 : m1.entrySet()){//to iterate key value together
		System.out.println(i2);
	}
	          Iterator <Entry <String,Double>> i3=  m1.entrySet().iterator();//to iterate key value together
	          while(i3.hasNext()) {
	        	  System.out.println(i3.next());//69,70 assignment
	          }
}
}
