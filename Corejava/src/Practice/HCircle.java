package Practice;

public class HCircle extends HShape {
	
	private double radius;
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	
	
	
	public void cArea() {
		double area=3.14*getRadius()*getRadius();
		System.out.println(area);
	}

}
