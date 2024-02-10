package in.co.rays.basic;

public class Ainvayi_String_Buffer_Method {
	
	public static void main(String[] args) {
		
		StringBuffer mn = new StringBuffer("Vijay");
		mn.append(" Dinanath Chouhan");
		
		System.out.println(mn.length());
		System.out.println(mn.capacity());
		System.out.println(mn.charAt(2));
		System.out.println(mn.indexOf("Chou"));
		System.out.println(mn.replace(0,5,"Jay"));
		System.out.println(mn.reverse());
		
		
		
	}

}
