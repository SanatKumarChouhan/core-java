package Practice_Collection;

import java.util.Stack;

public class TestStack {
	
	public static void main (String[] args) {
		
		Stack s=new Stack();
		
		//LIFO ( last in first out.)
		//methods:- 1. push(); 2.pop(); and 3.peek();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		//s.peek();
		
		System.out.println("Stacks " + s);
		
		s.pop();
		s.pop();
		
		 System.out.println("peek "+s.peek());
		
		
		
		
		
	}

}
