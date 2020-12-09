package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToArrayList {

	public static void main(String[] args) {
              HashMap<String,Integer>  map = new HashMap<String,Integer>();
              map.put("Google", 10000);
              map.put("HCL", 50000);
              map.put("Infosys", 25000);
              map.put("TCS", 1000);
              	
              
       Iterator it = map.entrySet().iterator();
       
     while(it.hasNext()) {
    	 Map.Entry pairs = (Entry) it.next();
    	 System.out.println(pairs.getKey()+ " = " + pairs.getValue());
    	 
     }
        //Convert Hashmap keys to Arrays
     	
     List<String> keylist = new ArrayList<String>(map.keySet());
     
   //System.out.println(keylist);
     
     for(String s: keylist ) {
    	 
    	 System.out.println(s);
     }
     
   List<Integer> valueslist = new ArrayList<Integer>(map.values());
  // System.out.println(valueslist);
   
   for(Integer e : valueslist ) {
   
   System.out.println(e);
	}
      map.forEach((k,v)->System.out.println( "Key="+k+" Value ="  +v));
	}
}
