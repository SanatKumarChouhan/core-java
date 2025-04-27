package Practice_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue_LinkedList {
	
	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<Integer>();
		
		
		//Ordered.
		//FIFO.
		
		q.add(10);
		q.offer(20);
		q.offer(15);
		q.offer(30);
		q.add(50);
		
//		System.out.println("Queue= "+ q);
//		
//		q.remove();
//		
//		System.out.println("remove= "+q);
//		
//		q.poll();
//		
//		System.out.println("poll= "+ q);
//		
//		q.peek();
//		
//		System.out.println(q);
		
		System.out.println("Queue= "+ q);
		System.out.println("Queue remove= "+ q.remove() );
		System.out.println("Queue= "+ q);
		System.out.println("Queue poll= "+ q.poll());
		System.out.println("Queue= "+ q);
		System.out.println("Queue peek= "+ q.peek());
		
	}

}
