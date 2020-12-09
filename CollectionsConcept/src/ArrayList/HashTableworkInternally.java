package ArrayList;

import java.util.Hashtable;

public class HashTableworkInternally {

	public static void main(String[] args) {
		
		//do not allow any null key and values
		//initial capacity is 11 and LF = 0.75
		
		
		Hashtable htable= new Hashtable();
		htable.put(1, "Venky");
		htable.put(2, "Venky2");
		htable.put(3, "Venky3");
		htable.put(4, "Venky4");

		System.out.println(htable);
	}

}
