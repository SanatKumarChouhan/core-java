package in.co.rays.inheritance11;

public class TestShape {
	
	public static void main(String[] args) {
		
		//Circle
		System.out.println("circle=========");
		Circle c=new Circle();
		
		c.setRadius(10);
		c.area();
		
		System.out.println(c.getRadius());
		
		//Triangle
		
		System.out.println("Triangle========");
		
		Triangle t=new Triangle();
		
		t.setBase(10);
		t.setHieght(20);
		
		System.out.println(t.getBase());
		System.out.println(t.getHieght());
		
		t.area();
		
		//Rectangular
		
		System.out.println("Ractangular=======");
		
		Ractangle r=new Ractangle();
		
		r.setLength(30);
		r.setWidth(40);
		
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		
		r.area();
		
		
		
		
		
		
		
	}

}
