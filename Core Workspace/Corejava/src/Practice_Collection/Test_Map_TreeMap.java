package Practice_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class Test_Map_TreeMap {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm=new TreeMap();
		
		//sorted by key.
		//null key not allowed. null values can be allowed.
		
		
		
		//tm.put(null, 0);
		tm.put("zero", null);
		tm.put("third", 30);
		tm.put("first", 10);
		tm.put("second", 20);
		tm.put("fourth", 40);
		
		System.out.println(tm);
		
		
		//list sorting with the help of Arrays.sort(); Method.
		
		int arr[] = {5,8,3,9,2,1,6,4,0};
		Arrays.sort(arr);
		for(Object a : arr) {
			System.out.println(a);
		}
		
		//binary search in Arrays.
		
		System.out.println(Arrays.binarySearch(arr, 8));
		
		ArrayList<String> arra=new ArrayList();
		
		arra.add("second");
		arra.add("first");
		arra.add("third");
		
		System.out.println(arra); //ordered but not sorted.
		
		Collections.sort(arra); //import collection. for sorting.
		
		Collections.max(arra);
		System.out.println("max= "+Collections.max(arra));
		
		System.out.println(arra); //sorted.
		
	}

}
