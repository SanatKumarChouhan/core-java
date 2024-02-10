package in.co.rays.oop;

public class XXAutoMobile {

	private String CarColor;
	private int SpeedInKMPH;
	private String Manufacturing;
	public static final int NoOfGears=5; 
	
	public void setCarColor(String carcolor) {
		this.CarColor=carcolor;
	}
	public String getCarColor() {
		return CarColor;
	}
	public void setSpeedInKMPH(int speed){
         this.SpeedInKMPH=speed;	
	}
	public int getSpeedInKMPH() {
	     return SpeedInKMPH;
	}
	
	public void setManufacturing(String Manufacturing) {
		this.Manufacturing=Manufacturing;
	}
	public String getManufacturing() {
		return Manufacturing;
	}
	
}
