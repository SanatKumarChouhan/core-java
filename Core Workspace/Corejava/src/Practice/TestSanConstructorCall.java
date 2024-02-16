package Practice;

public class TestSanConstructorCall {

	public static void main(String[] args) {

		SanConstructorCall sc1 = new SanConstructorCall("Thar", "Top", 77);
		System.out.println(sc1.carName);
		System.out.println(sc1.model);

		SanConstructorCall sc2 = new SanConstructorCall("Creta", "SXO", 2021);
		System.out.println(sc2.carName);
		System.out.println(sc2.carName);
		System.out.println(sc2.yop);

		SanConstructorCall sc3 = new SanConstructorCall("Mahindra", "Middle", 2020);

		sc1.displayPrint();
		sc3.displayPrint();
	}

}
