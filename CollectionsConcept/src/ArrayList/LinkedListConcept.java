package ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(30);
		ll.add(40);
		ll.add(90);
		System.out.println(ll.size());
       System.out.println(ll.get(3));
       ll.addLast(922);
       ll.addFirst(9484);
       
       System.out.println(ll);
       ll.removeFirst();
       System.out.println(ll);
       
       //ForLoop
       
       for(int i=0;i<ll.size();i++) {
    	   System.out.println(ll.get(i));
    	   
       }
       System.out.println("Advance for Loop");
       
      for(Object j:ll) {
    	  System.out.println(j);
      }
       
       System.out.println("while");
      int  num=0;
       
       while(ll.size()>num) {
    	   System.out.println(ll.get(num));
    	   num++;
       }
       System.out.println("Iterator");
       Iterator it=ll.iterator();
       while(it.hasNext()) {
    	   System.out.println(it.next());
       }
       
       System.out.println("##########################");
       System.out.println(ll);
	}

}
