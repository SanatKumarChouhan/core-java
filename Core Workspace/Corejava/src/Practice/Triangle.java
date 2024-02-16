package Practice;

public class Triangle extends Shape {
	
	private int Base;
	private int Height;
	
	public void setBase(int base) {
		this.Base=base;
	}
	
	public int getBase() {
	return Base;
	}
	
	public void setHeight(int height) {
		this.Height=height;
	}
	
	public int getHeight() {
		return Height;
	}
	
	public void area() {
		int rArea=getBase()*getHeight()/2;
		System.out.println(rArea);
		
		
	}
	
	

}
