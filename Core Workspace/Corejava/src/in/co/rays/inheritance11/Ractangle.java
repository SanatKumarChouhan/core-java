package in.co.rays.inheritance11;

public class Ractangle extends Shape {
	
	
	private int length;
	private int width;
	
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void area() {
		
		int R=getLength()*getWidth();
		
		System.out.println(R);
	}
	

}
