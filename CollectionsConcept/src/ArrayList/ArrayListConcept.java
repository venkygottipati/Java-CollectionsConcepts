package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		int ar[] = new int[3];
		ar[0]=20;
		ar[1]=30;
		ar[2]=40;
		// ar[3]=50;  To avoid java.lang.ArrayIndexOutOfBoundsException we can go for ArrayList in Collections
		int a=ar.length;
		System.out.println(a);
     
       ArrayList<Integer> arr=new ArrayList<Integer>();
       arr.add(20);
       arr.add(10);
       arr.add(30);
       arr.add(40);
       arr.add(50);
       arr.add(60);
//       arr.add(70.50);
//       arr.add("Venky Gottipati");
       System.out.println(arr.size());
       System.out.println(arr.size()-1);
       System.out.println("************");
     for(int i=0;i<arr.size();i++) {
    	 System.out.println(arr.get(i));
     }
     
     Employee e = new Employee("Venky", 35, "it");
     Employee e1 = new Employee("Venky1", 36, "it1");
     Employee e2 = new Employee("Venky2", 37, "it2");
     Employee e3 = new Employee("Venky3", 38, "it3"); 
     
     ArrayList<Employee> ar2=new ArrayList<Employee>();
     ar2.add(e3);
     ar2.add(e2);
     ar2.add(e1);
     ar2.add(e);
     System.out.println("##########");
     Iterator<Employee> it= ar2.iterator();
          while(it.hasNext())   {
        	  Employee emp= it.next();
        	  
        	 System.out.println(emp.name); 
        	 System.out.println(emp.age);
        	 System.out.println(emp.dep);
          }

          ArrayList e4=new ArrayList();
          
          e4.add("Test");
          e4.add("20");
          e4.add("Automation");
          
          ArrayList e5=new ArrayList();
          e5.add("Test");
          e5.add("30");
          e5.add("Selenium");
          
         e4.addAll(e5);
         System.out.println("AdALLL");
          System.out.println(e4);
          e4.removeAll(e5);
          System.out.println(e4);
          e4.retainAll(e5);
          System.out.println(e4);
	}

}
