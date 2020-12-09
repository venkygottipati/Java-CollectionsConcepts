package ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListFeatures {

	public static void main(String[] args) {
		
	/*1. linked List is default Class in java
	2. it can be used as List,Stack,Queue		
	3. its allows null entry
	4. Dynamic in collections ,insertion, deletion
	5.contains duplicates values
	6. Not synchronized( No Thread safety)
	7.Manipulation is fast **/

      LinkedList<String> ll =new LinkedList<String>();
       System.out.println(ll.size());
		ll.add("Venky");
		ll.add("Gottipati");
		ll.add("Selenium");
		System.out.println(ll.size());
		ll.add("Appu");
		System.out.println(ll);
		ll.add(1, "GV");
		System.out.println(ll);
		ll.addFirst("First");
		
		 LinkedList<String> ll1 =new LinkedList<String>();
		 
		 ll1.addAll(ll);
		 System.out.println("ll1 List is =" + ll1);
		 
		 ll1.removeAll(ll);
		 System.out.println(ll1);
		 
		Iterator it= ll.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		Collections.sort(ll);
		
		System.out.println(ll);
	}

}
