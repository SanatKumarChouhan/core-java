package in.co.rays.inheritance11;

public class Circle extends Shape {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	public void area() {
		
		double tArea=3.14*getRadius()*getRadius();
		
		
		System.out.println(tArea);
		
	}
	
	
	
	

}
