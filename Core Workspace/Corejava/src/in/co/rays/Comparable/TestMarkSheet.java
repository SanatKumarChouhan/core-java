package in.co.rays.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestMarkSheet {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add(new MarkSheet(3, "shanu mishra", 150));
		list.add(new MarkSheet(7, "bitty lowanshi", 167));
		list.add(new MarkSheet(2, "shivam mishra", 183));
		list.add(new MarkSheet(1, "aman shandilya", 123));
		
		//System.out.println(list);
		
		
		Collections.sort(list);
		 
		for (Object obj:list) {
			System.out.println(obj);
		}
		
	}

}
