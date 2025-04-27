package Practice_Collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		Set set=new HashSet();
		
		//Set <Integer> set=new HashSet();
		
		//unordered, does not stored duplicate elements.
		//it stores unique value.
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(30);
		
		
		
		System.out.println(set);
		
	}

}
