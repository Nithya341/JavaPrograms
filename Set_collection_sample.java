package List_Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_collection_sample {
public static void main(String[] args) {
	List l2= new ArrayList();
	l2.add("Nithya");
	l2.add("Nithya");
	
	
	Collection a = new ArrayList();
	a.add("Nithya");
	a.add("sumi");
	a.add("Kavi");
	a.add("Divya");
    a.add("Divya");                                    
    Collection noduplicates = new HashSet(a);
    System.out.println(a);
    System.out.println(noduplicates);
	Set l1= new HashSet();
	Set l3 = new LinkedHashSet();     
	l3.addAll(l2);//converting list to set to remove the duplicate value
	System.out.println(l2);
	System.out.println(l3);
	l1.add("Nithya");
	l1.add("sumi");
	l1.add("Kavi");
	l1.add("Divya");
	
	//Collection.sort(l1);
}
}
