package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> tvSeries=new ArrayList();
		tvSeries.add("D");
		tvSeries.add("Game of thrones");
		tvSeries.add("BigBoss");
		tvSeries.add("wow");
		tvSeries.add("the BigBang Theaory");
		tvSeries.add("Cash");
		
		//1. using for each loop and lambda expression:
		System.out.println("====== each loop and lambda expression ==========");
		tvSeries.forEach(tvshows ->{
			System.out.println(tvshows);
		});
		
		
		tvSeries.forEach(tvshows->{
			System.out.println(tvshows);
		});
		
		
		System.out.println("========Using Iterator==========");
		//2. Using Iterator
		
		Iterator<String> it =tvSeries.iterator();
		
		while(it.hasNext()) {
	        Object shows=    it.next();
		     System.out.println(shows);
		}
		
		// 3. Using iterator and java 8 forEachRemaining(); method
		System.out.println("===========Using iterator and java 8 forEachRemaining(); method=============");
		
	         it=	tvSeries.iterator();
		it.forEachRemaining(show->{
			System.out.println(show);
		});
		
		// 4. For each Lopp
		System.out.println("=============For each Lopp================");
		
		for(String show: tvSeries) {
			System.out.println(show);
		}
		
		//5. For loop with order/index
		System.out.println("=======For loop with order/index========");
		
		for(int i=0;i<tvSeries.size();i++) {
			System.out.println(tvSeries.get(i));
		}
		
		//5. Using ListIterator
		System.out.println("=================Using ListIterator===================");
		
		ListIterator<String> showlist=tvSeries.listIterator(tvSeries.size());
		
		while(showlist.hasPrevious()) {
			
		String list = showlist.previous();
		  System.out.println(list);
		}
	}

}
