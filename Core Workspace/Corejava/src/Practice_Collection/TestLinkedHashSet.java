package Practice_Collection;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		//Ordered
		//Unique
		//but does not stored duplicate value.
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(25);
		lhs.add(25); //here, not print duplicate value on consol.
		lhs.add(30);
		lhs.add(40);
		lhs.add(50);
		
		lhs.remove(10);
		lhs.remove(25);
		
		lhs.contains(50);
		//or
		boolean bl=lhs.contains(40);
		System.out.println("40 present or not= "+ bl);
		
		
		//lhs.removeAll(lhs);
		
		System.out.println(lhs.contains(50));
		//System.out.println(lhs.removeAll(lhs));
		
		//lhs.size();
		
		System.out.println("size "+lhs.size());
		
		
		//lhs.removeAll(lhs);
		
		
		System.out.println(lhs);
		
	}

}
