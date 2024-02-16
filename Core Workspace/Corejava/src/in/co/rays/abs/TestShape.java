package in.co.rays.abs;

public class TestShape {
	
	public static void main(String[] args) {
		
		Ractangle r=new Ractangle();
		
		r.setLength(25);
		
		r.setWidth(20);
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		
		
		r.area();
		
		r.sum();
		
		//by using variables
		//Shape s=new Ractangle();
		
		//s.sum();
	   //s.area();
		
		
	}

}
