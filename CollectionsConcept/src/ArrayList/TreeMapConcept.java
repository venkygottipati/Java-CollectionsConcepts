package ArrayList;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		 TreeMap<Integer,String> treemap= new TreeMap<Integer,String>(Comparator.reverseOrder());
		 
           treemap.put(1, "Venky");
           treemap.put(10, "Final");
           treemap.put(2, "Gottipati2");
           treemap.put(3, "NiviN");
           treemap.put(4, "MahaDev");
           System.out.println(treemap);
           
           treemap.forEach((k,v)-> System.out.println("Key = " + k +" and " + "Value="+v));
           
           
         System.out.println(treemap.firstEntry()); 
          System.out.println(treemap.lastEntry());
          
        Set treeset   =treemap.headMap(5).keySet();
        
        System.out.println(treeset);
        
        
        Set ltreeset   =treemap.tailMap(5).keySet();
           System.out.println(ltreeset);
	}
	
	}


