package Practice_Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {
	
	public static void main(String[] args) {
		
		Deque<Integer> adq=new ArrayDeque<Integer>();
		
		//Double Ended Queue.
		
		adq.offer(10);
		adq.offer(20);
		adq.offerLast(30);
		adq.offerFirst(40);
		
		System.out.println(adq);
		
		System.out.println();
		
		adq.getFirst();
		adq.getLast();
		
		System.out.println(adq.getClass());
		
		System.out.println(adq);
		
		System.out.println("get first= "+adq.getFirst());
		System.out.println("get last= "+adq.getLast());
		
		System.out.println();
		
		System.out.println("peek= "+adq.peek());
		System.out.println("peek first= "+adq.peekFirst());
		System.out.println("peek last= "+adq.peekLast());
		
		System.out.println();
		
		System.out.println("poll or remove= "+ adq.poll());
		System.out.println("poll first or remove= "+adq.pollFirst());
		System.out.println("poll last or remove= "+adq.pollLast());
		
		System.out.println();
		
		System.out.println(adq);
	}

}
