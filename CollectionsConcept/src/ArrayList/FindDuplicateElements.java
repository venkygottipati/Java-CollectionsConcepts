package ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		String names[] = {"Java","venky","Veer","Java","Veer","Java" };
		
	

		
//1. Compare each element o(num) --- Nor recomended
		for (int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				
				if(names[i]==names[j]) {
					System.out.println("Duplicae element is :" + names[i]);
					
				}
			}
		}
		System.out.println("===============");
	//2. Using HashSet :it store unique values
		
		Set<String> strore=new HashSet<String>();
	
		for(String name:names) {
			if(strore.add(name)==false)
				System.out.println("Duplicate element is : " +name);
			   
			
		}
		System.out.println("=================");
		//3.Using HashMap :o(2n)
		
		Map<String,Integer> storemap= new HashMap();
		
		    for(String name:names) {
		    Integer count	=storemap.get(name);
		    if (count==null) {
		    	storemap.put(name, 1);
		    }else {
		    	storemap.put(name, ++count);
		    }
		    
		    }
		    //Get the values
		      
		    Set<Entry<String, Integer>>  entryset= storemap.entrySet();
		    
		    for(Entry<String, Integer> entry:entryset) {
		    	if(entry.getValue()>1) {
		    		System.out.println("Duplicate value is :" +entry.getKey());
		    	}
		    }
			
			
	}

}
