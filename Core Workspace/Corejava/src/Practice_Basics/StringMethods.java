package Practice_Basics;

public class StringMethods {

	public static void main(String[] args) {

		String name = "Vijay Dinanath Chouhan";

		System.out.println(name.length());

		System.out.println(name.charAt(10));

		System.out.println(name.indexOf("K"));

		System.out.println(name.indexOf("hou"));

		System.out.println(name.lastIndexOf("a"));

		System.out.println(name.indexOf("a"));

		System.out.println(name.replace("a", "i"));

		System.out.println(name.toUpperCase());

		System.out.println(name.toLowerCase());

		System.out.println(name.startsWith("Sa"));

		System.out.println(name.endsWith("ha"));
	}

}
