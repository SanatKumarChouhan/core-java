package Practice_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestList_ArrayList_Collection {

	public static void main(String[] args) {

		ArrayList <String> list = new ArrayList();
		
		list.add("shanu");
		list.add("shivam");
		list.add("bittu");
		
		//list.add(29);
		
		//list.removeAll(list);
		
		//list.clear();
		
		
		
		System.out.println(list);
		
		Collections.max(list);
		System.out.println("Max= "+Collections.max(list));
		
		Collections.sort(list); //for sorting the list alphabaticaly.
		
		System.out.println(list); //print sorted list.
		
		//Iterator.
		
		Iterator it = list.iterator(); //import iterator.
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
//		List<Integer> list=new ArrayList();
//		
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(2, 25);
//		list.add("shanu");
//
//		System.out.println(list);

//		List list=new ArrayList();
//		
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(1, 15);
//		list.add(40);
//		list.add(50);
//		list.add(1, 16);
//		list.add(1, 14);
//		
//		list.remove(4);
//		
//		System.out.println(list);

	}

}
