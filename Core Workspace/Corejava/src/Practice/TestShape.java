package Practice;

public class TestShape extends Triangle {
	
	public static void main(String[] args) {
		
		Triangle t=new Triangle();
		
		//System.out.println("*******Multi Level Shape********");
		
		t.setColor("Mat Gray");
		t.setBorderWidth(26);
		
		System.out.println(t.getColor());
		System.out.println(t.getBorderWidth());
		
		
		t.setBase(10);
		t.setHeight(20);
		
		
		//System.out.println("*******Multi Level Triangle*********");
		System.out.println(t.getBase());
		System.out.println(t.getHeight());
		
		t.area();
		
		
		
		
		
	}
	
	

}
