package List_Arraylist;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface_methodssample {
	public static void main(String[] args) {
		
		Map<String,Integer> li = new HashMap<String,Integer>();
		li.put("Apple",2);
		li.put("Orange",3);
		li.put("Kiwi",1);
		li.put("Payaya",2);
		li.put("Banana",5);
		System.out.println("The fruit quantity is "+li.values());
		li.remove("Banana");
		Iterator <Entry<String,Integer>> a = li.entrySet().iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		li.remove(li);
		System.out.println(li);
		Map<Integer,String> l2 = new HashMap<Integer,String>();
		l2.put(1,"Nithya");
		l2.put(2,"Sumi");
		l2.put(3,"Kavi");
		Iterator <Entry<Integer,String>> a1 = l2.entrySet().iterator();
		while(a1.hasNext()) {
			if(l2.containsValue(1)== true)
			{
				System.out.println(l2.get(1));
			}
			System.out.println(a1.next());
		}//Assignment 71 ,72
		
		
	}

}
