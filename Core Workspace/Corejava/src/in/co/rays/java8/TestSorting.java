package in.co.rays.java8;

import java.util.Arrays;

public class TestSorting {
	
	
	public static void main(String[] args) {
		
		int[] arr= {2,34,8,67,98,9};
		
		Arrays.parallelSort(arr);
		
		
		for (int i : arr) {
			
			System.out.println(i);
			
		}
		
		
		
		
		
		
	}

}
