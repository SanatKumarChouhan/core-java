package Practice_Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		
		//For Max Heap.
	
		//PriorityQueue pq=new PriorityQueue(Comparator.reverseOrder());
		
		//Minimum Priority= least no. of your list.
		//Max Priority= Max no. of your list.
		
		pq.add(5);
		pq.add(8);
		pq.offer(11);
		pq.offer(3);
		pq.offer(10);
		pq.offer(1);
		pq.offer(9);
		pq.offer(9);
		pq.add(2);
		pq.offer(7);
		
		//Print karne par bydefault pehle min value hi print karega but last me max no. print nahi karega.
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		pq.poll();
		System.out.println(pq.peek());
		
		pq.poll();
		System.out.println(pq.peek());
		
		pq.poll();
		System.out.println(pq.peek());
		
		pq.poll();
		System.out.println(pq.peek());
		
		pq.poll();
		System.out.println(pq.peek());
		
		System.out.println();
		
		
		
	}

}
