package in.co.rays.basic;

public class Ainvayi4 {
	
	public static void main(String[] args) {
		
		int[][] table=new int[10][10];
		
		for (int i=0; i<table.length; i++) {
			
			for (int j=0; j<table.length; j++) {
				
				table[i][j]= (i+1)*(j*1);
				
				System.out.println(table[i][j]+"/t");
			}
		}
		
		System.out.println();
		System.out.println();
	}
	
	
	
	
		
}
