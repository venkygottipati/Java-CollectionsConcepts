package ArrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
     HashSet<String> hset  = new HashSet<String>();
     
     hset.add("Hello");
     hset.add("Selenium");
     System.out.println(hset);
     hset.add("Hello");
     System.out.println(hset.size());
     
     hset.add(null);
     System.out.println(hset);
     
     System.out.println(hset.contains("Hello"));
     
     for( String s:hset) {
    	 System.out.println(s);
     }
     hset.remove("Hello");
     
     Set<Integer>  first = new HashSet<Integer>();
     first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,10}));
     
     Set<Integer>  second = new HashSet<Integer>();
     second.addAll(Arrays.asList(new Integer[] {5,6,7,8,10}));
     
    //union
     Set<Integer>  union = new HashSet<Integer>(first);
    union.addAll(second);
    System.out.println(union);
    
    //Insertion
    Set<Integer>  insertion = new HashSet<Integer>(first);
    
    insertion.retainAll(second);
    System.out.println(insertion);
    
    //Get the difference
    Set<Integer>  diff = new HashSet<Integer>(first);
    
    diff.removeAll(second);
    System.out.println(diff);
	}

}
