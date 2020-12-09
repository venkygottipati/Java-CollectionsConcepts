package ArrayList;

import java.util.HashMap;
import java.util.Map.Entry;

//Non Synchronized ....  in mUsedulti threading ...multiple threads can access....not thread safe
public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		
		
		System.out.println(map);
       map.put(1, "Venky");
       map.put(2, "Gottipati");
       map.put(3, "Gottipati NiviN Mahadev");
       map.put(4, "Avulamanda");
       map.put(523304, "Avulamanda");
       System.out.println(map);
		System.out.println(map.containsValue("Gottipati"));
		System.out.println(map.containsKey(1));
		System.out.println(map.size());
		System.out.println(map.get(523304));
		
		HashMap<Integer,String> map2= new HashMap<Integer,String>();
		
		map2.put(1, "Aparna");
		map2.put(2, "Gottipati1");
		
		map.putAll(map2);
		System.out.println(map);
		System.out.println(map2.get(10));
		System.out.println("########## For Loop ############");
		for(int i=1;i<=map.size();i++) {
			System.out.println(map.get(i));
		}
		
		System.out.println("### While  #########");
		int num =1;
		while(num<=map.size()) {
			System.out.println(map.get(num));
			num++;
		}
			System.out.println("****Traverse********");
	  for(Entry<Integer, String> m:map.entrySet()) {
		  
         System.out.println(m.getKey()+ " "+m.getValue());
	
         
	  }
		System.out.println("$$$$$$$$ HashMap stores Objects $$$$$$$$$$");
		
		Employee e = new Employee("Test", 25, "Automation");
		Employee e1 = new Employee("Test1", 26, "Automation1");
		Employee e2= new Employee("Test2", 27, "Automation2");
		
		HashMap<Integer,Employee> emp = new HashMap<Integer,Employee>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e);
		
		for(Entry<Integer,Employee> m : emp.entrySet()) {
			int key=m.getKey();
			Employee ee =m.getValue();
			System.out.println(key+ "  Info ");
			System.out.println(ee.name + " " +e.age + " "+e.dep);
		
		}
		}
	}


