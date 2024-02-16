package Practice;

public class HRactangle extends HShape {

	private int length;
	private int breadth;
	
	public void setLenght(int length) {
		this.length=length;
	}
	public int getLength() {
		return length;
	}
	
	public void setBreadth(int breadth) {
		this.breadth=breadth;
	}
	public int getBreadth() {
		return breadth;
	}
	
	public void rArea() {
		int area=getLength()*getBreadth();
		System.out.println(area);
	}
	
	
	
}
