package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	
	
	
	static  void findduplicatechar(String str) {
		
		HashMap<Character,Integer> hm= new HashMap<>();
	
		
		for(int i=0;i<str.length(); i++) {
			
			char c = str.charAt(i);
			if(hm.get(c)!=null) {
				hm.put(c,hm.get(c)+1);
				
			}else {
				hm.put(c, 1);
			}
		
		}
		System.out.println(hm);
	
	}

	
	static void duplicatesTwo(String str) {
		HashMap<Character,Integer> hm=new HashMap();
		for(int i=0;i<str.length();i++) {
			 char c  = str.charAt(i);
			 if(hm.get(c)!=null) {
				 hm.put(c, hm.get(c)+1);
				 
			 }else {
				 hm.put(c, 1);
			 }
			
			
		}
		System.out.println(hm);
	
	}
	public static void main(String[] args) {
		
		
		      
		ArrayList list=new ArrayList(Arrays.asList(1,2,5,6,6,6,9,8));
		
		// 1. Linked HashSet
            HashSet set=new HashSet(list);
            ArrayList  Removedlist=new ArrayList(set);
            System.out.println(Removedlist);
            
        //  2. JDK 8 Stream
            
            List   newlist =   (List) list.stream().distinct().collect(Collectors.toList());
            
            System.out.println(newlist);
            System.out.println("===========================");
            
         //3. Find count of character
            findduplicatechar("aaafffgggvvb"      );
            duplicatesTwo("kjdjgfasdtbdnbfdguwasadbhasdgiourergrg");
	}

}
