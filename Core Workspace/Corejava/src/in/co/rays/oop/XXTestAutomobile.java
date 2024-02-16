package in.co.rays.oop;

public class XXTestAutomobile {
	
	public static void main(String[] args) {
		
		XXAutoMobile am=new XXAutoMobile();
		
		am.setCarColor("Silver Gray");
		am.setSpeedInKMPH(80);
		am.setManufacturing("TATA");
		
		System.out.println(am.getCarColor());
		System.out.println(am.getSpeedInKMPH());
		System.out.println(am.getManufacturing());
		System.out.println(am.NoOfGears);
		
	}

}
