package Practice;

public class ReportCard {

	public String name;
	public double marksObtain;
	public double totalMarks;

	public ReportCard(String name, double marksObtain, double totalMarks) {

		this.name = name;
		this.marksObtain = marksObtain;
		this.totalMarks = totalMarks;
	}

	public void per() {

		double a = marksObtain * 100;
		double b = totalMarks;

		double c = a / b;

		System.out.println(name + " " + c + "%");
	}

}
