package Practice_Collection;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		List <Integer> ll = new LinkedList();
		
		
		//hamesha pehle by default 0 index ki hi value ayegi. aap pehle index 1 nahi de sakte
		//ll.add(1, 20);
		//ll.add(10);
		
		ll.add(10);
		ll.add(20);
		ll.add(1, 15);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		
		
		
		System.out.println(ll);
		
	}

}
