package Practice_Collection;

import java.util.Vector;

public class TestVectorList {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add(0, "counting");
		
		//v.remove(1);
		
		System.out.println(v);
		
	}
	
}
