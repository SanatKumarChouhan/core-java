package Practice;

public class TestReportCard {

	public static void main(String[] args) {

		ReportCard rc1 = new ReportCard("shanu", 350, 500);
		ReportCard rc2 = new ReportCard("bittu", 343, 500);
		ReportCard rc3 = new ReportCard("sonu", 378, 500);

		rc1.per();
		rc2.per();
		rc3.per();

	}

}
