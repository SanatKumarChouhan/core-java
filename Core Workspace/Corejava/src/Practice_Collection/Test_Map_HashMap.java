package Practice_Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test_Map_HashMap {

	public static void main(String[] args) {

		HashMap<String, Integer> m = new HashMap();

		// Unordered.
		// Null key and Null value can be insert.
		//key unique.
		//value can be duplicate.

//		m.put("second", 20);
//		m.put("first", 10);
//		m.put("fourth", 40);
//		m.put("third", 30);
//		m.put("fifth", 50);

		m.put(null, 0);
		m.put("zero", null);
		m.put("first", 10);
		m.put("second", 20);
		m.put("third", 30);
		m.put("fourth", 40);

		System.out.println(m);

		// get the value by key.

		System.out.println("get the value by key fourth= " + m.get("fourth"));
		System.out.println("get the keys by the value of 40= "+m.get(40));

		int val = (int) m.get("first"); // another way to get and print value by key.
		System.out.println("get the value by key 2= " + val);

		// Remove an element by key.

		// m.remove(2);
		System.out.println(m);
		System.out.println("remove= " + m.remove("second"));
		System.out.println("remove by value of fourth= " + m.remove(40));
		System.out.println(m);

		// get the collection of keys and print.

		Set keys = m.keySet(); // Import set collection.
		for (Object k : keys) {
			System.out.println("keys= " + k);
		}
		
		System.out.println();

		// Get the collection of values and print.

		Collection values = m.values(); // Import collection.
		for (Object v : values) {
			System.out.println("values= " + v);
		}
		
		System.out.println();

		// Print All Keys and Values Pair.

		Set KeyValue = m.entrySet();
		for ( Object ele : KeyValue) {
			System.out.println("keys and values= "+ele);
		}
		
		System.out.println();

//		Set KeyValue = m.entrySet();
//		for (Object ele : KeyValue) {
//			m.Entry pair = (m.Entry) ele;
//			System.out.println(pair.getKey() + " " + pair.getValue());
//		}
		
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		
		System.out.println();
		
		System.out.println("first keys is present= "+m.containsKey("first"));
		System.out.println("40 value is present= "+m.containsValue(40));
		System.out.println("fifth key is present= "+m.containsKey("fifth"));
		System.out.println("12 value is present= "+m.containsValue(12));

	}

}
