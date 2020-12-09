package ArrayList;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {

	public static void main(String[] args) {
           Hashtable h=new Hashtable();
           
           h.put(1, "Venky");
           h.put(6, "Nivin");
           h.put(2, "Gottipati");
           h.put(3, "NiVi");
           h.put(4, "Mahadev");  //Contains only unique values
          // h.put(null, "hello");   null point execution
           
  
           Hashtable h1=new Hashtable(); 
           //Clone the values 
         h1  = (Hashtable) h.clone();
         System.out.println(h1);
         System.out.println(h);
    
//         h1.clear();
//         h.clear();
         System.out.println(h1);
         //System.out.println(h);
         
         //Contains
         if(h.contains("Gottipati")) {
        	 System.out.println("printed value found");
         }else {
        	 System.out.println("Not found");
         }
        	 
        	 //How to print all the values using enumeration--elements();
        	 
        	 System.out.println("*********Enumeration-elements()**********");
               	Enumeration e= h.elements();
               	
        	    while( e.hasMoreElements()) {
        	    	 
          	    	System.out.println(e.nextElement());
        	    }
        	  //Get all values from Hashtable using entrySet() ----set of Hashtable elements
        	    
           	 System.out.println("*********entrySet() -elements()**********");
           	 
           	 Set s=h.entrySet();
           	 System.out.println(s);
           	 
           	 Hashtable h2=new Hashtable();
             
             h.put(1, "Venky");
             h.put(6, "Nivin");
             h.put(2, "Gottipati");
             h.put(3, "NiVi");
             h.put(4, "Mahadev");
             
             //Check both the hashtables are equal or not 
             
             if(h.equals(h1)) {
            	 System.out.println("Both Hashtables are qual ");
             }else {
            	 System.out.println("Hashtables not equal");
             }
             //Get the values of key
             System.out.println("The values of key h(1) is :"+ h.get(1));
             
             //Get the Hashcode of Hashtable
             System.out.println("Hash code is :" +h.hashCode());
        	    
         }
	
}

