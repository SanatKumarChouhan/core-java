package Practice_Collection;

import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		
		//Unordered.
		//No duplicate value stored.
		//Only Unique value.
		//But sorted.
		
		ts.add(5);
		ts.add(2);
		ts.add(1);
		ts.add(4);
		ts.add(3);
		ts.add(3);
		
		//and many more methods which you can apply.
		
		System.out.println(ts);
		
		
	}

}
