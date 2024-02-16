package Practice;

public class SanConstructorCall {

	public String carName;
	public String model;
	public int yop;
	public int yos;

	public SanConstructorCall() {
		System.out.println("Vehicle Details");
	}

	public SanConstructorCall(String carname, String model, int year) {

		this.carName = carname;
		this.model = model;
		this.yop = year;

//		System.out.println("Name = "+CarName);
//		System.out.println("Model = "+Model);
//		System.out.println("year = "+yop);

	}

	public SanConstructorCall(String name, String modell, int yop, int yos) {
		this.carName = name;
		this.model = modell;
		this.yop = yop;
		this.yos = yos;

	}

	public void displayPrint() {
		System.out.println(this.carName);
		System.out.println(this.model);
		System.out.println(this.yop);
		System.out.println(this.yos);
	}

}
