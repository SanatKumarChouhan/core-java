package in.co.rays.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMapCollection {

	public static void main(String[] args) {

		Map<Integer, Object> map = new HashMap<>();

		map.put(1, 11);
		map.put(2, 12);
		map.put(3, 13);
		map.put(4, 14);
		map.put(5, 15.15);
		map.put(6, 16.16);

		System.out.println(map);

		for (Map.Entry<Integer, Object> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		Set<Integer> keys =  map.keySet();
//		
		for (Integer key : keys) {
		    System.out.println("Key: " + key);
		}

		
//		Map map=new HashMap();
//		
//		map.put(1, "shanu");
//		
//		map.put(2, "bittu");
//		
//		map.put(3, "sachin");
//		
//		map.put(4, "sonu");
//		
//		System.out.println(map);
//		
//		map.replace(1, "monu");
//		
//		System.out.println(map);
//		
//		map.remove(2);
//		System.out.println(map);

	}

}
