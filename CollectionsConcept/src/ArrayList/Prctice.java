package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class Prctice {

	public static void main(String[] args) {
		
	
		
		String str="dkhjksahgjkhjkhasfhfdhsdasf";
		
		HashMap<Character,Integer> map=new HashMap();
		
		for(int i=0;i<str.length();i++) {
			
			  char c =  str.charAt(i);
			  
			  if(map.get(c)!=null) {
				  map.put(c, map.get(c)+1);
			  }else {
				  
				  map.put(c, 1);
			  }
		}
		

     
      System.out.println("==========================");
	}
	

}
