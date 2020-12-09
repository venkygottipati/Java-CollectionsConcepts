package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CompareHashMaps {

	public static void main(String[] args) {
		HashMap<Integer,String> map =new HashMap<Integer,String>();
		
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "c");
        map.put(4, "D");
        
		HashMap<Integer,String> map1 =new HashMap<Integer,String>();
		    map1.put(1, "A");
	        map1.put(2, "B");
	        map1.put(3, "c");
	        map1.put(4, "D");
	        map1.put(5, "D");
	        //map1.put(5, "E");
	        
	       //1. On the basis of Key and value  use equals(); 
	       System.out.println(map.equals(map1)); 
	       
	       //2. Compare HashMaps for same Keys Use  keySet();
	       
	       System.out.println(map.keySet().equals(map1.keySet()));
	       
	       //3. Find out extra keys
	       
	       HashSet set = new HashSet(map.keySet());
	       
	       set.addAll(map1.keySet());
	       System.out.println(set);
	       
	       set.removeAll(map1.keySet());
	       System.out.println(set);
	       
	       //4. Compare maps By values
	       
	       HashMap<Integer,String> map3 =new HashMap<Integer,String>();  
	        map3.put(1, "A");
	        map3.put(2, "B");
	        map3.put(3, "c");
	        map3.put(4, "D");
	        map3.put(5, "E");
	        map3.put(6, "F");
	        
	       //  4.1 Duplicates not allowed
	        
	       System.out.println(new ArrayList<>(map.values()).equals(new ArrayList<>(map1.values())));
	       
	       //4.2 Duplicates allowed using HashSet
	       System.out.println(new HashSet<>(map.values()).equals(new HashSet<>(map1.values())));
	       
	       
	       //CocurrentHashMap doesn't through "ConcurrentModificationException "
	       ConcurrentHashMap<Integer,String> cmap=new ConcurrentHashMap<Integer,String>();
	       cmap.put(1, "venky");
	       //Create Synchronization HashMap
	       
	       Map<Integer, String> syncMap= Collections.synchronizedMap(map1);
	       syncMap.put(1, "Raaj");
	}

}
