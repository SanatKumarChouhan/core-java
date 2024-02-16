package Practice;

public class ARactangle extends AShape{
	
	private int length;
	private int width;
	
	public void setLength(int length) {
		this.length=length;
	}
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	public int getWidth() {
		return width;
	}
	
	@Override
	public void area() {
		
		int rArea=getLength()*getWidth();
		
		System.out.println(rArea);
		
	}
}
