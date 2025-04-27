package in.co.rays.java8;

public class TestLembdaExpression {
	
	public static void main(String[] args) {
		
		Hello h=()->{
			
			System.out.println("test By lembda expresssion");
		};
		
		h.say();
		
		
		
	}

}
