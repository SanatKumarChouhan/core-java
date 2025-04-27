package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Yyyyy {

	public static void main(String[] args) {

		List<String> list = new ArrayList();

		list.add("prakhar");
		list.add("aryan");
		list.add("shubham");
		list.add("shubhamshu");
		list.add("shivani");
		list.add("shivi");
		list.add("shanu");

		int i = 0;

//		i -= i;

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			String object = (String) it.next();

//			if ("aryan".equals(object) || "prakhar".equals(object)) {
//				it.remove();
//			}

//			if (object.startsWith("s")) {
//
//				it.remove();
//
//			}
//			i++;
//			System.out.println(i);
			System.out.println("objects>>>>>   " + ++i + object);

		}
//		System.out.println("list>>>>   " + list);
	}

}
