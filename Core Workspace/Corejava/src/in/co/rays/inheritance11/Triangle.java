package in.co.rays.inheritance11;

public class Triangle extends Shape {
	
	
	private int base;
	private int hieght;
	
	
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getHieght() {
		return hieght;
	}
	
	public void setHieght(int hieght) {
		this.hieght = hieght;
	}
	
	public void area() {
		
		int rArea=getBase()*getHieght()/2;
		System.out.println(rArea);
	}
	
	
	
	

}
